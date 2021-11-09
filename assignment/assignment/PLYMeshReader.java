package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLYMeshReader implements MeshReader {

	@Override
	public HashSet<Polygon> read(String fileName) throws FileNotFoundException {
		File ply_file = new File(fileName);
		
		if (!ply_file.exists())
			throw new IllegalArgumentException("Input file: " + fileName + " was not found.");
		
		Scanner ply_fileScan = new Scanner(ply_file);
		
		Pattern vertex_pattern = Pattern.compile("^(-?\\d+(\\.\\d+)?(E-?\\d+)?\\s){2}(-?\\d+(\\.\\d+)?(E-?\\d+)?\\s*)");
		Pattern polygon_pattern = Pattern.compile("^(\\d+\\s)+\\d+");
		
		HashMap<Integer, Vertex> vertices_hashMap = new HashMap<Integer, Vertex>();
		
		HashSet<Polygon> polygons_hashSet = new HashSet<Polygon>();
		
		int vertex_count = -1;
		int polygon_count = -1;
		
		// Traverse header and get # of vertices and polygons in file.
		while (ply_fileScan.hasNextLine())
		{
			String curr_line = ply_fileScan.nextLine();
			
			//System.out.println(curr_line);
			
			String[] curr_arr = curr_line.split(" ");
			
			if (curr_arr.length == 3 && curr_arr[0].equals("element") && curr_arr[1].equals("vertex"))
			{
				vertex_count = Integer.parseInt(curr_arr[2]);
			}
			
			if (curr_arr.length == 3 && curr_arr[0].equals("element") && curr_arr[1].equals("face"))
			{
				polygon_count = Integer.parseInt(curr_arr[2]);
			}
			
			if (curr_arr.length == 1 && curr_arr[0].equals("end_header"))
			{
				break;
			}
		}
		
		if (vertex_count == -1 || polygon_count == -1)
		{
			ply_fileScan.close();
			throw new IllegalArgumentException("Input file: " + fileName + " is not properly formatted.");
		}
		
		if (vertex_count == 0)
		{
			ply_fileScan.close();
			throw new IllegalArgumentException("File doesn't contain any vertices.");
		}
		
		if (polygon_count == 0)
		{
			ply_fileScan.close();
			throw new IllegalArgumentException("File doesn't contain any polygons.");
		}
		
		int current_line_count = 10;
		
		while (ply_fileScan.hasNextLine())
		{
			String current_line = ply_fileScan.nextLine();
			
			//System.out.println(current_line);
			
			Matcher vertex_matcher = vertex_pattern.matcher(current_line);
			Matcher polygon_matcher = polygon_pattern.matcher(current_line);
			
			if (current_line_count - 10 < vertex_count)
			{
				if (!vertex_matcher.lookingAt())
				{
					ply_fileScan.close();
					throw new IllegalArgumentException("Invalid data format at line " + current_line_count + " in file: " + fileName + ".");
				}
				
				String[] split_vert_str = current_line.split(" ");
				
				double x = Double.parseDouble(split_vert_str[0]);
				double y = Double.parseDouble(split_vert_str[1]);
				double z = Double.parseDouble(split_vert_str[2]);
				
				Vertex new_vertex = new Vertex(x, y, z);
				
				vertices_hashMap.put(current_line_count - 10, new_vertex);
			}
			else if (current_line_count - vertex_count - 10 < polygon_count)
			{
				if (!polygon_matcher.lookingAt())
				{
					ply_fileScan.close();
					throw new IllegalArgumentException("Invalid data format at line " + current_line_count + " in file: " + fileName + ".");
				}
				
				String[] split_poly_str = current_line.split(" ");
				
				LinkedHashSet<Vertex> vertices_linked_hashSet = new LinkedHashSet<Vertex>();
				
				for (int i = 1; i < Integer.parseInt(split_poly_str[0]) + 1; i++)
				{
					int index = Integer.parseInt(split_poly_str[i]);
					
					if (!vertices_hashMap.containsKey(index))
					{
						ply_fileScan.close();
						throw new ArrayIndexOutOfBoundsException("Vertex #" + index + " does not exist in file: " + fileName + ".");
					}
					
					Vertex vertex = vertices_hashMap.get(index);
					
					vertices_linked_hashSet.add(vertex);
				}
				
				Polygon new_polygon = new Polygon(vertices_linked_hashSet);
				
				polygons_hashSet.add(new_polygon);
			}
			else
			{
				ply_fileScan.close();
				throw new ArrayIndexOutOfBoundsException("Unexpected data entry at line #" + current_line_count + "in file: " + fileName + ".");
			}
			
			current_line_count++;
		}
		
		ply_fileScan.close();
		
		return polygons_hashSet;
	}
}