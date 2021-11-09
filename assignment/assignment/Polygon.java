package assignment;

import java.util.LinkedHashSet;
//import java.util.Iterator;

public class Polygon extends GraphicalObject {
	LinkedHashSet<Vertex> vertices;
	
	public Polygon(LinkedHashSet<Vertex> vertices) {
		this.vertices = vertices;
	}

	@Override
	public void transform(double[][] matrix) {
		for (Vertex vertex : this.vertices)
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
        
        Polygon other = (Polygon) obj;
        
        if (vertices == other.vertices)
        	return true;
        if (other.vertices == null)
        	return false;
        
        if (vertices.size() != other.vertices.size())
        	return false;
        
        for (Vertex vertex : vertices)
        {
        	if (!other.vertices.contains(vertex))
        		return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash_code = 17;
        for (Vertex vertex : vertices)
        {
        	hash_code += 3 * vertex.hashCode() - 1;
        }
        
        return hash_code;
    }
}