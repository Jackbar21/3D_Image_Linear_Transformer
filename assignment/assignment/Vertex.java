package assignment;

public class Vertex extends GraphicalObject
{
	double x;
	double y;
	double z;
	
	public Vertex(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
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

        Vertex other = (Vertex) obj;
        if (x != other.x)
        	return false;
        if (y != other.y)
        	return false;
        if (z != other.z)
        	return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        long x_val = Double.doubleToLongBits(x);
        long y_val = Double.doubleToLongBits(y);
        long z_val = Double.doubleToLongBits(z);
    	
        int hash_code = (int) (x_val ^ (x_val >>> 32));
    	hash_code = 37 * hash_code + (int) (y_val ^ (y_val >>> 32));
        hash_code = 37 * hash_code + (int) (z_val ^ (z_val >>> 32));
        return hash_code;
    }
    
    @Override
    public String toString()
    {
    	return x + " " + y + " " + z;
    }

	@Override
	public void transform(double[][] matrix)
	{
		if (matrix == null)
			throw new NullPointerException("Matrix is undefined (null)");
			// ASK ARYAN IF RETURN IS NECESSARY OR NOT!
			//return;
		
		if (matrix.length != 3)
			// Throw InvalidMatrixRowCount Exception
			throw new IllegalArgumentException("Invalid matrix row size");
			//return;
		
		if (matrix[0].length != 3)
			// Throw InvalidMatrixColumnCount Exception
			throw new IllegalArgumentException("Invalid matrix column size");
			//return;
		
		double a = matrix[0][0] * x + matrix[0][1] * y + matrix[0][2] * z;
		double b = matrix[1][0] * x + matrix[1][1] * y + matrix[1][2] * z;
		double c = matrix[2][0] * x + matrix[2][1] * y + matrix[2][2] * z;
		
		x = a;
		y = b;
		z = c;
	}
}