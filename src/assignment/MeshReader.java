package assignment;

import java.io.FileNotFoundException;
import java.util.HashSet;

public interface MeshReader {
	public HashSet<Polygon> read(String fileName) throws FileNotFoundException;
}