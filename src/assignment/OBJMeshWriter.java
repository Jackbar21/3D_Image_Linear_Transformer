package assignment;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.HashSet;

public class OBJMeshWriter implements MeshWriter {

	@Override
	public void write(String fileName, HashSet<Polygon> polygons) throws FileNotFoundException, IOException {
		FileWriter obj_file = new FileWriter(fileName);
		
		// LinkedHashMap instead of HashMap to preserve insertion order.
		LinkedHashMap<Vertex, Integer> vertices_linked_hashMap = new LinkedHashMap<Vertex, Integer>();
		
		int index = 1;
		
		if (polygons == null)
		{
			obj_file.close();
			return;
		}
		
		for (Polygon polygon : polygons)
		{
			for (Vertex vertex : polygon.vertices)
			{
				if (!vertices_linked_hashMap.containsKey(vertex))
				{
					obj_file.write("v " + vertex.toString() + "\n");
					// *** ADD BELOW FOR LOOP HERE *** //
					vertices_linked_hashMap.put(vertex, index);
					index++;
				}
			}
		}
		
		/* Consider adding this for loop in the one above (where mentioned)
		for (Vertex vertex : vertices_linked_hashMap.keySet())
		{
			obj_file.write("v " + vertex.toString() + "\n");
		}*/
		
		for (Polygon polygon : polygons)
		{
			String face = "f ";
			for (Vertex vertex : polygon.vertices)
			{
				face = face + vertices_linked_hashMap.get(vertex).toString() + " ";
			}
			
			obj_file.write(face + "\n");
		}
		
		obj_file.close();
		
		return;
	}
}