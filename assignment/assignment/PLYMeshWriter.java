package assignment;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.HashSet;

public class PLYMeshWriter implements MeshWriter {

	@Override
	public void write(String fileName, HashSet<Polygon> polygons) throws FileNotFoundException, IOException {
		FileWriter ply_file = new FileWriter(fileName);
		
		// LinkedHashMap instead of HashMap to preserve insertion order.
		LinkedHashMap<Vertex, Integer> vertices_linked_hashMap = new LinkedHashMap<Vertex, Integer>();
		
		int index = 0;
		
		int polygon_count = 0;
		
		if (polygons == null)
		{
			ply_file.close();
			return;
		}
		
		for (Polygon polygon : polygons)
		{
			for (Vertex vertex : polygon.vertices)
			{
				if (!vertices_linked_hashMap.containsKey(vertex))
				{
					// *** ADD BELOW FOR LOOP HERE *** //
					vertices_linked_hashMap.put(vertex, index);
					index++;
				}
			}
			
			polygon_count++;
		}
		
		int vertex_count = index;
		
		ply_file.write("ply\n");
		ply_file.write("format ascii 1.0\n");
		ply_file.write("element vertex " + vertex_count + "\n");
		ply_file.write("property float32 x\n");
		ply_file.write("property float32 y\n");
		ply_file.write("property float32 z\n");
		ply_file.write("element face " + polygon_count + "\n");
		ply_file.write("property list uint8 int32 vertex_indices\n");
		ply_file.write("end_header\n");
		
		
		// Consider adding this for loop in the one above (where mentioned)
		for (Vertex vertex : vertices_linked_hashMap.keySet())
		{
			ply_file.write(vertex.toString() + "\n");
		}
		
		for (Polygon polygon : polygons)
		{
			String face = polygon.vertices.size() + " ";
			for (Vertex vertex : polygon.vertices)
			{
				face = face + vertices_linked_hashMap.get(vertex).toString() + " ";
			}
			
			ply_file.write(face.stripTrailing() + "\n");
		}
		
		ply_file.close();
		
		return;
	}
}