package assignment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Mesh extends GraphicalObject {
	HashSet<Polygon> polygons;
	
	MeshReader reader;
	MeshWriter writer;
	
	public void setReader(MeshReader reader)
	{
		this.reader = reader;
	}
	
	public void setWriter(MeshWriter writer)
	{
		this.writer = writer;
	}
	
	public void readFromFile(String fileName) throws FileNotFoundException
	{
		// !(A || B) <==> !A && !B by DeMorgan's Law
		if (!fileName.endsWith(".obj") && !fileName.endsWith(".ply"))
			throw new IllegalArgumentException("Invalid filetype: no '.obj' nor '.ply' extension detected at end of file: " + fileName + ".");
		
		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (extension.equals("obj"))
		{
			//reader = (OBJMeshReader) reader;
			this.setReader(new OBJMeshReader());
		}
		else //if (extension.equals("ply"))
		{
			//reader = (PLYMeshReader) reader;
			this.setReader(new PLYMeshReader());
			
		}
		/* Unnecessary else statement, added for sake of clarity.
		else
		{
			throw new IllegalArgumentException("Invalid file extension");
		}*/
		
		polygons = reader.read(fileName);
	}
	
	public void writeToFile(String fileName) throws IOException
	{
		// !(A || B) <==> !A && !B by DeMorgan's Law
		if (!fileName.endsWith(".obj") && !fileName.endsWith(".ply"))
			throw new IllegalArgumentException("Invalid filetype: no '.obj' nor '.ply' extension detected at end of file: " + fileName + ".");
		
		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (extension.equals("obj"))
		{
			//writer = (OBJMeshWriter) writer;
			this.setWriter(new OBJMeshWriter());
		}
		else //if (extension.equals("ply"))
		{
			//writer = (PLYMeshWriter) writer;
			this.setWriter(new PLYMeshWriter());
			
		}
		/* Unnecessary else statement, added for sake of clarity.
		else
		{
			throw new IllegalArgumentException("Invalid file extension");
		}*/
		
		writer.write(fileName, polygons);
	}

	@Override
	public void transform(double[][] matrix) {
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		for (Polygon polygon : polygons)
		{
			for (Vertex vertex : polygon.vertices)
			{
				// Ensures no duplicate vertex is added to
				// 'vertices' by property of LinkedHashSet
				vertices.add(vertex);
			}
		}
		
		// We transform the vertices this way to ensure
		// no vertex gets transformed twice, as polygons
		// within a mesh can reuse the same vertex.
		for (Vertex vertex : vertices)
		{
			vertex.transform(matrix);
		}
	}
	
	@Override
	public boolean equals(Object obj)
    {	
		if (this == obj)
        	return true;
        if (obj == null)
        	return false;
        if (getClass() != obj.getClass())
        	return false;

        Mesh other = (Mesh) obj;
        
        if (reader != other.reader)
        {
	        if (other.reader == null)
	        	return false;
	        if (reader.getClass() != other.reader.getClass())
	        	return false;
        }
        
        if (writer != other.writer)
        {
        	if (other.writer == null)
            	return false;
            if (writer.getClass() != other.writer.getClass())
            	return false;
        }
        
        
        if (this.polygons == other.polygons)
        	return true;
        if (other.polygons == null)
        	return false;
        
        // *** CONSIDER 'other.polygons == null' CASE *** //
        if (polygons.size() != other.polygons.size())
        	return false;
        
        for (Polygon polygon : polygons)
        {
        	if (!other.polygons.contains(polygon))
        		return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash_code = 11;
        for (Polygon polygon : polygons)
        {
        	hash_code *= polygon.hashCode() + 1;
        }
        
        return hash_code;
    }
}