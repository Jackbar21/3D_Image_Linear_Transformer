package assignment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public interface MeshWriter {
	public void write(String fileName, HashSet<Polygon> polygons) throws FileNotFoundException, IOException;
}