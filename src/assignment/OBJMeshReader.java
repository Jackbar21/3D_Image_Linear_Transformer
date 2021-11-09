package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OBJMeshReader implements MeshReader {
	
	@Override
	public HashSet<Polygon> read(String fileName) throws FileNotFoundException {
		File obj_file = new File(fileName);
		
		if (!obj_file.exists())
			throw new IllegalArgumentException("Input file: " + fileName + " was not found.");
		
		Scanner obj_fileScan = new Scanner(obj_file);
		
		Pattern vertex_pattern = Pattern.compile("^v((\\s-?\\d+(\\.\\d+)?)(E-?\\d+)?){3}");
		Pattern polygon_pattern = Pattern.compile("^f(\\s\\d+)+");
		
		HashMap<Integer, Vertex> vertices_hashMap = new HashMap<Integer, Vertex>();
		
		HashSet<Polygon> polygons_hashSet = new HashSet<Polygon>();
		
		int current_line_count = 1;
		
		while (obj_fileScan.hasNextLine())
		{
			String current_line = obj_fileScan.nextLine();
			
			Matcher vertex_matcher = vertex_pattern.matcher(current_line);
			Matcher polygon_matcher = polygon_pattern.matcher(current_line);
			
			if (vertex_matcher.lookingAt()) // && current_line.startsWith("v ")
			{
				String[] split_vert_str = current_line.split(" ");
				
				double x = Double.parseDouble(split_vert_str[1]);
				double y = Double.parseDouble(split_vert_str[2]);
				double z = Double.parseDouble(split_vert_str[3]);
				
				Vertex new_vertex = new Vertex(x, y, z);
				
				vertices_hashMap.put(current_line_count, new_vertex);
			}
			else if (polygon_matcher.lookingAt()) // && current_line.startsWith("f "))
			{
				String[] split_poly_str = current_line.split(" ");
				
				LinkedHashSet<Vertex> vertices_linked_hashSet = new LinkedHashSet<Vertex>();
				
				for (int i = 1; i < split_poly_str.length; i++)
				{
					int index = Integer.parseInt(split_poly_str[i]);
					
					if (!vertices_hashMap.containsKey(index))
					{
						obj_fileScan.close();
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
				obj_fileScan.close();
				throw new IllegalArgumentException("Invalid data format at line " + current_line_count + " in file: " + fileName + ".");
			}
			
			current_line_count++;
		}
		
		obj_fileScan.close();
		
		return polygons_hashSet;
	}
}