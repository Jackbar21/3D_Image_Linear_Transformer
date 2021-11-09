package assignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
	
	static String directory = "/Users/alejandro/Desktop/b07/ASSIGNMENTS/A1/";

	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		Mesh mesh = new Mesh();
		
		mesh.setReader(new OBJMeshReader()); 
		mesh.readFromFile(directory + "car.obj"); 
		
		mesh.rotateYAxis(Math.PI/3);
		
		mesh.setWriter(new OBJMeshWriter()); 
		mesh.writeToFile(directory + "car_rotated.obj"); 
		
		mesh.setWriter(new PLYMeshWriter()); 
		mesh.writeToFile(directory + "car_rotated.ply");
		
		return;
	}
}