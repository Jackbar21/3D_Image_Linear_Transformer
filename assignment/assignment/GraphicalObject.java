package assignment;

//import java.util.*;

public abstract class GraphicalObject
{
	
	public abstract void transform(double[][] matrix);
	
	public void rotateXAxis(double angle_theta)
	{
		double[][] x_matrix = new double[3][3];
		
		// Row 1
		x_matrix[0][0] = 1;
		x_matrix[0][1] = 0;
		x_matrix[0][2] = 0;
		
		// Row 2
		x_matrix[1][0] = 0;
		x_matrix[1][1] = Math.cos(angle_theta);
		x_matrix[1][2] = -1*Math.sin(angle_theta);
		
		// Row 3
		x_matrix[2][0] = 0;
		x_matrix[2][1] = Math.sin(angle_theta);
		x_matrix[2][2] = Math.cos(angle_theta);
		
		transform(x_matrix);
	}
	
	public void rotateYAxis(double angle_theta)
	{
		double[][] y_matrix = new double[3][3];
		
		// Row 1
		y_matrix[0][0] = Math.cos(angle_theta);
		y_matrix[0][1] = 0;
		y_matrix[0][2] = Math.sin(angle_theta);
		
		// Row 2
		y_matrix[1][0] = 0;
		y_matrix[1][1] = 1;
		y_matrix[1][2] = 0;
		
		// Row 3
		y_matrix[2][0] = -1*Math.sin(angle_theta);
		y_matrix[2][1] = 0;
		y_matrix[2][2] = Math.cos(angle_theta);
		
		transform(y_matrix);
	}
	
	public void rotateZAxis(double angle_theta)
	{
		double[][] z_matrix = new double[3][3];
		
		// Row 1
		z_matrix[0][0] = Math.cos(angle_theta);
		z_matrix[0][1] = -1*Math.sin(angle_theta);
		z_matrix[0][2] = 0;
		
		// Row 2
		z_matrix[1][0] = Math.sin(angle_theta);
		z_matrix[1][1] = Math.cos(angle_theta);
		z_matrix[1][2] = 0;
		
		// Row 3
		z_matrix[2][0] = 0;
		z_matrix[2][1] = 0;
		z_matrix[2][2] = 1;
		
		transform(z_matrix);
	}
}
