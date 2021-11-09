package assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;

class A1Tests {

	static String directory = "/Users/alejandro/Desktop/b07/ASSIGNMENTS/A1/";
	
	// GRAPHICAL OBJECT TESTS (START) //
	
	@Test
	void vertex_rotateXAxis() {
		Double theta = Math.PI / 3;
		
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		vertex.rotateXAxis(theta);
		
		double a = 1 * 3.14159 + 0 * 2.6535 + 0 * 420.69;
		double b = 0 * 3.14159 + Math.cos(theta) * 2.6535 + -1 * Math.sin(theta) * 420.69;
		double c = 0 * 3.14159 + Math.sin(theta) * 2.6535 + Math.cos(theta) * 420.69;
		
		Vertex rotated_vertex = new Vertex(a, b, c);
		
		assertTrue(vertex.equals(rotated_vertex));
	}
	
	@Test
	void vertex_rotateYAxis() {
		Double theta = Math.PI / 2;
		
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		vertex.rotateYAxis(theta);
		
		double a = Math.cos(theta) * 3.14159 + 0 * 2.6535 + Math.sin(theta) * 420.69;
		double b = 0 * 3.14159 + 1 * 2.6535 + 0 * 420.69;
		double c = -1 * Math.sin(theta) * 3.14159 + 0 * 2.6535 + Math.cos(theta) * 420.69;
		
		Vertex rotated_vertex = new Vertex(a, b, c);
		
		assertTrue(vertex.equals(rotated_vertex));
	}
	
	@Test
	void vertex_rotateZAxis() {
		Double theta = Math.PI;
		
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		vertex.rotateZAxis(theta);
		
		double a = Math.cos(theta) * 3.14159 + -1 * Math.sin(theta) * 2.6535 + 0 * 420.69;
		double b = Math.sin(theta) * 3.14159 + Math.cos(theta) * 2.6535 + 0 * 420.69;
		double c = 0 * 3.14159 + 0 * 2.6535 + 1 * 420.69;
		
		Vertex rotated_vertex = new Vertex(a, b, c);
		
		assertTrue(vertex.equals(rotated_vertex));
	}
	
	@Test
	void polygon_rotateXAxis() {
		Double theta = Math.PI / 3;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		polygon.rotateXAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		v1.rotateXAxis(theta);
		v2.rotateXAxis(theta);
		v3.rotateXAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices = new LinkedHashSet<Vertex>();
		
		rotated_vertices.add(v1);
		rotated_vertices.add(v2);
		rotated_vertices.add(v3);
		
		Polygon rotated_polygon = new Polygon(rotated_vertices);
		
		assertTrue(polygon.equals(rotated_polygon));
	}
	
	@Test
	void polygon_rotateYAxis() {
		Double theta = Math.PI / 4;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		polygon.rotateYAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		v1.rotateYAxis(theta);
		v2.rotateYAxis(theta);
		v3.rotateYAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices = new LinkedHashSet<Vertex>();
		
		rotated_vertices.add(v1);
		rotated_vertices.add(v2);
		rotated_vertices.add(v3);
		
		Polygon rotated_polygon = new Polygon(rotated_vertices);
		
		assertTrue(polygon.equals(rotated_polygon));
	}
	
	@Test
	void polygon_rotateZAxis() {
		Double theta = Math.PI / 6;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		polygon.rotateZAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		v1.rotateZAxis(theta);
		v2.rotateZAxis(theta);
		v3.rotateZAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices = new LinkedHashSet<Vertex>();
		
		rotated_vertices.add(v1);
		rotated_vertices.add(v2);
		rotated_vertices.add(v3);
		
		Polygon rotated_polygon = new Polygon(rotated_vertices);
		
		assertTrue(polygon.equals(rotated_polygon));
	}
	
	@Test
	void mesh_rotateXAxis() {
		Double theta = 2 * Math.PI / 3;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		mesh.rotateXAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		Vertex v4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex v5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex v6 = new Vertex(98, 7, 6.5);
		Vertex v7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		v1.rotateXAxis(theta);
		v2.rotateXAxis(theta);
		v3.rotateXAxis(theta);
		v4.rotateXAxis(theta);
		v5.rotateXAxis(theta);
		v6.rotateXAxis(theta);
		v7.rotateXAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices1 = new LinkedHashSet<Vertex>();
		
		rotated_vertices1.add(v1);
		rotated_vertices1.add(v2);
		rotated_vertices1.add(v3);
		
		LinkedHashSet<Vertex> rotated_vertices2 = new LinkedHashSet<Vertex>();
		
		rotated_vertices2.add(v4);
		rotated_vertices2.add(v5);
		rotated_vertices2.add(v6);
		
		LinkedHashSet<Vertex> rotated_vertices3 = new LinkedHashSet<Vertex>();
		
		rotated_vertices3.add(v2);
		rotated_vertices3.add(v5);
		rotated_vertices3.add(v7);
		
		Polygon rotated_polygon1 = new Polygon(rotated_vertices1);
		Polygon rotated_polygon2 = new Polygon(rotated_vertices2);
		Polygon rotated_polygon3 = new Polygon(rotated_vertices3);
		
		LinkedHashSet<Polygon> rotated_polygons = new LinkedHashSet<Polygon>();
		
		rotated_polygons.add(rotated_polygon1);
		rotated_polygons.add(rotated_polygon2);
		rotated_polygons.add(rotated_polygon3);
		
		Mesh rotated_mesh = new Mesh();
		rotated_mesh.polygons = rotated_polygons;
		
		assertTrue(mesh.equals(rotated_mesh));
	}
	
	@Test
	void mesh_rotateYAxis() {
		Double theta = 5 * Math.PI / 6;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		mesh.rotateYAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		Vertex v4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex v5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex v6 = new Vertex(98, 7, 6.5);
		Vertex v7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		v1.rotateYAxis(theta);
		v2.rotateYAxis(theta);
		v3.rotateYAxis(theta);
		v4.rotateYAxis(theta);
		v5.rotateYAxis(theta);
		v6.rotateYAxis(theta);
		v7.rotateYAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices1 = new LinkedHashSet<Vertex>();
		
		rotated_vertices1.add(v1);
		rotated_vertices1.add(v2);
		rotated_vertices1.add(v3);
		
		LinkedHashSet<Vertex> rotated_vertices2 = new LinkedHashSet<Vertex>();
		
		rotated_vertices2.add(v4);
		rotated_vertices2.add(v5);
		rotated_vertices2.add(v6);
		
		LinkedHashSet<Vertex> rotated_vertices3 = new LinkedHashSet<Vertex>();
		
		rotated_vertices3.add(v2);
		rotated_vertices3.add(v5);
		rotated_vertices3.add(v7);
		
		Polygon rotated_polygon1 = new Polygon(rotated_vertices1);
		Polygon rotated_polygon2 = new Polygon(rotated_vertices2);
		Polygon rotated_polygon3 = new Polygon(rotated_vertices3);
		
		LinkedHashSet<Polygon> rotated_polygons = new LinkedHashSet<Polygon>();
		
		rotated_polygons.add(rotated_polygon1);
		rotated_polygons.add(rotated_polygon2);
		rotated_polygons.add(rotated_polygon3);
		
		Mesh rotated_mesh = new Mesh();
		rotated_mesh.polygons = rotated_polygons;
		
		assertTrue(mesh.equals(rotated_mesh));
	}
	
	@Test
	void mesh_rotateZAxis() {
		Double theta = 3 * Math.PI / 2;
		
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		mesh.rotateZAxis(theta);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		Vertex v4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex v5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex v6 = new Vertex(98, 7, 6.5);
		Vertex v7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		v1.rotateZAxis(theta);
		v2.rotateZAxis(theta);
		v3.rotateZAxis(theta);
		v4.rotateZAxis(theta);
		v5.rotateZAxis(theta);
		v6.rotateZAxis(theta);
		v7.rotateZAxis(theta);
		
		LinkedHashSet<Vertex> rotated_vertices1 = new LinkedHashSet<Vertex>();
		
		rotated_vertices1.add(v1);
		rotated_vertices1.add(v2);
		rotated_vertices1.add(v3);
		
		LinkedHashSet<Vertex> rotated_vertices2 = new LinkedHashSet<Vertex>();
		
		rotated_vertices2.add(v4);
		rotated_vertices2.add(v5);
		rotated_vertices2.add(v6);
		
		LinkedHashSet<Vertex> rotated_vertices3 = new LinkedHashSet<Vertex>();
		
		rotated_vertices3.add(v2);
		rotated_vertices3.add(v5);
		rotated_vertices3.add(v7);
		
		Polygon rotated_polygon1 = new Polygon(rotated_vertices1);
		Polygon rotated_polygon2 = new Polygon(rotated_vertices2);
		Polygon rotated_polygon3 = new Polygon(rotated_vertices3);
		
		LinkedHashSet<Polygon> rotated_polygons = new LinkedHashSet<Polygon>();
		
		rotated_polygons.add(rotated_polygon1);
		rotated_polygons.add(rotated_polygon2);
		rotated_polygons.add(rotated_polygon3);
		
		Mesh rotated_mesh = new Mesh();
		rotated_mesh.polygons = rotated_polygons;
		
		assertTrue(mesh.equals(rotated_mesh));
	}
	
	// GRAPHICAL OBJECT TESTS (END) //
	
	
	
	// VERTEX TESTS (START) //
	
	@Test
	void vertex_constructor() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		assertEquals(vertex.x, 3.14159);
		assertEquals(vertex.y, 2.6535);
		assertEquals(vertex.z, 420.69);
	}
	
	@Test
	void vertex_equals1() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		assertTrue(vertex.equals(vertex));
		
	}
	
	@Test
	void vertex_equals2() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		assertFalse(vertex.equals(null));
	}
	
	@Test
	void vertex_equals3() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		
		Polygon polygon = new Polygon(vertices);
		
		assertFalse(vertex.equals(polygon));
	}
	
	@Test
	void vertex_equals4() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		Vertex vertex2 = new Vertex(95141.3, 2.6535, 420.69);
		
		assertFalse(vertex.equals(vertex2));
	}
	
	@Test
	void vertex_equals5() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		Vertex vertex2 = new Vertex(3.14159, 5356.2, 420.69);
		
		assertFalse(vertex.equals(vertex2));
	}
	
	@Test
	void vertex_equals6() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		Vertex vertex2 = new Vertex(3.14159, 2.6535, 69.420);
		
		assertFalse(vertex.equals(vertex2));
	}
	
	@Test
	void vertex_equals7() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		Vertex vertex2 = new Vertex(3.14159, 2.6535, 420.69);
		
		assertTrue(vertex.equals(vertex2));
	}
	
	@Test
	void vertex_hashCode1() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		long a = Double.doubleToLongBits(3.14159);
		long b = Double.doubleToLongBits(2.6535);
		long c = Double.doubleToLongBits(420.69);
		
		int hash_code = (int) (a ^ (a >>> 32));
    	hash_code = 37 * hash_code + (int) (b ^ (b >>> 32));
        hash_code = 37 * hash_code + (int) (c ^ (c >>> 32));
		
		assertEquals(vertex.hashCode(), hash_code);
		
	}
	
	@Test
	void vertex_hashCode2() {
		Vertex vertex1 = new Vertex(3.14159, 2.6535, 420.69);
		Vertex vertex2 = new Vertex(420.69, 2.6535, 3.14159);
		
		assertNotEquals(vertex1.hashCode(), vertex2.hashCode());
		
	}
	
	@Test
	void vertex_toString() {
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		String vertex_string = "3.14159 2.6535 420.69";
		assertEquals(vertex.toString(), vertex_string);
		
	}
	
	@Test
	void vertex_transfrom1()
	{
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		double[][] matrix = null;
		
		Throwable null_matrix_exception = assertThrows(NullPointerException.class, () -> {
			vertex.transform(matrix);
	    });
		
		assertEquals("Matrix is undefined (null)", null_matrix_exception.getMessage());
		
		/* Rawad's Method (decided not to implement
		// test this way, as it leaves room for
		// 'uncertainty' from not asserting throw.
		try {
			vertex.transform(matrix);
			assertTrue(false); <-- want to return false in case above line doesn't throw exception
		}
		catch(NullPointerException e)
		{
			assertEquals("Matrix is undefined (null)", e.getMessage());
		}*/
	}
	
	@Test
	void vertex_transfrom2()
	{
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		double[][] matrix = new double[4][3];
		
		//		 	 [  1  2  3  ]
		// matrix == [  4  5  6  ]
		//			 [  7  8  9  ]
		//			 [  10 11 12 ]
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		Throwable row_matrix_exception = assertThrows(IllegalArgumentException.class, () -> {
			vertex.transform(matrix);
	    });
		
		assertEquals("Invalid matrix row size", row_matrix_exception.getMessage());
	}
	
	@Test
	void vertex_transfrom3()
	{
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		double[][] matrix = new double[3][4];
		
		//	 	 	 [  1  2  3  4  ]
		// matrix == [  5  6  7  8  ]
		//			 [  9  10 11 12 ]
	
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		Throwable column_matrix_exception = assertThrows(IllegalArgumentException.class, () -> {
			vertex.transform(matrix);
	    });
			
		assertEquals("Invalid matrix column size", column_matrix_exception.getMessage());
	}
	
	@Test
	void vertex_transfrom4()
	{
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		double[][] matrix = new double[3][3];
		
		//			 [ 1  2  3 ]
		// matrix == [ 4  5  6 ]
		//			 [ 7  8  9 ]
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		vertex.transform(matrix);
		
		// Avoid use of matrix here to ensure complete
		// correctness within this test method.
		double a = 1 * 3.14159 + 2 * 2.6535 + 3 * 420.69;
		double b = 4 * 3.14159 + 5 * 2.6535 + 6 * 420.69;
		double c = 7 * 3.14159 + 8 * 2.6535 + 9 * 420.69;
		
		Vertex test_vertex = new Vertex(a, b, c);
		
		
		
		assertEquals(vertex, test_vertex);
	}
	
	// VERTEX TESTS (END) //
	
	
	
	// POLYGON TESTS (START) //
	
	@Test
	void polygon_constructor() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		boolean flag = true;
		
		for (Vertex vertex : vertices)
		{
			if (!polygon.vertices.contains(vertex))
				flag = false;
		}
		
		assertTrue(flag);
	}
	
	@Test
	void polygon_transfrom1()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		double[][] matrix = null;
		
		Throwable null_matrix_exception = assertThrows(NullPointerException.class, () -> {
			polygon.transform(matrix);
	    });
		
		assertEquals("Matrix is undefined (null)", null_matrix_exception.getMessage());
	}
	
	@Test
	void polygon_transfrom2()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		double[][] matrix = new double[4][3];
		
		//		 	 [  1  2  3  ]
		// matrix == [  4  5  6  ]
		//			 [  7  8  9  ]
		//			 [  10 11 12 ]
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		Throwable row_matrix_exception = assertThrows(IllegalArgumentException.class, () -> {
			polygon.transform(matrix);
	    });
		
		assertEquals("Invalid matrix row size", row_matrix_exception.getMessage());
	}
	
	@Test
	void polygon_transfrom3()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		double[][] matrix = new double[3][4];
		
		//	 	 	 [  1  2  3  4  ]
		// matrix == [  5  6  7  8  ]
		//			 [  9  10 11 12 ]
	
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		Throwable column_matrix_exception = assertThrows(IllegalArgumentException.class, () -> {
			polygon.transform(matrix);
	    });
			
		assertEquals("Invalid matrix column size", column_matrix_exception.getMessage());
	}
	
	@Test
	void polygon_transfrom4()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		double[][] matrix = new double[3][3];
		
		//			 [ 1  2  3 ]
		// matrix == [ 4  5  6 ]
		//			 [ 7  8  9 ]
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = (3 * i) + j + 1;
			}
		}
		
		polygon.transform(matrix);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		v1.transform(matrix);
		v2.transform(matrix);
		v3.transform(matrix);
		
		LinkedHashSet<Vertex> transformed_vertices = new LinkedHashSet<Vertex>();
		
		transformed_vertices.add(v1);
		transformed_vertices.add(v2);
		transformed_vertices.add(v3);
		
		Polygon transformed_polygon = new Polygon(transformed_vertices);
		
		assertEquals(polygon, transformed_polygon);
	}
	
	@Test
	void polygon_equals1() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		assertTrue(polygon.equals(polygon));
		
	}
	
	@Test
	void polygon_equals2() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		assertFalse(polygon.equals(null));
	}
	
	@Test
	void polygon_equals3() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		Vertex vertex = new Vertex(3.14159, 2.6535, 420.69);
		
		assertFalse(polygon.equals(vertex));
	}
	
	@Test
	void polygon_equals4() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		Polygon polygon2 = new Polygon(vertices);
		
		assertTrue(polygon.equals(polygon2));
	}
	
	@Test
	void polygon_equals5() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		Polygon polygon2 = new Polygon(null);
		
		assertFalse(polygon.equals(polygon2));
	}
	
	@Test
	void polygon_equals6() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1); // polygon1.vertices.size() == 3
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(0, Math.PI, 69.420);
		Vertex v3 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v4 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v5 = new Vertex(90, 94, 31.1);
		Vertex v6 = new Vertex(90, 94, 31.1);
		Vertex v7 = new Vertex(69, 420, 69420);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(v1);
		vertices2.add(v2); // Duplicate won't be inserted
		vertices2.add(v3);
		vertices2.add(v4); // Duplicate won't be inserted
		vertices2.add(v5);
		vertices2.add(v6); // Duplicate won't be inserted
		vertices2.add(v7);
		
		Polygon polygon2 = new Polygon(vertices2); // polygon2.vertices.size() == 4
		
		assertFalse(polygon1.equals(polygon2));
	}
	
	@Test
	void polygon_equals7() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(69.420, 7 * Math.PI / 4, 420.69);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(v1);
		vertices2.add(v2);
		vertices2.add(v3);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		assertFalse(polygon1.equals(polygon2));
	}
	
	@Test
	void polygon_equals8() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(0, Math.PI, 69.420);
		Vertex v3 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v4 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v5 = new Vertex(90, 94, 31.1);
		Vertex v6 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(v1);
		vertices2.add(v2); // Duplicate won't be inserted
		vertices2.add(v3);
		vertices2.add(v4); // Duplicate won't be inserted
		vertices2.add(v5);
		vertices2.add(v6); // Duplicate won't be inserted
		
		Polygon polygon2 = new Polygon(vertices2);
		
		assertTrue(polygon1.equals(polygon2));
	}
	
	@Test
	void polygon_equals9() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex v1 = new Vertex(90, 94, 31.1);
		Vertex v2 = new Vertex(0, Math.PI, 69.420);
		Vertex v3 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(v1);
		vertices2.add(v2);
		vertices2.add(v3);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		assertTrue(polygon1.equals(polygon2));
	}
	
	@Test
	void polygon_hashCode() {
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
		
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
		
		Polygon polygon = new Polygon(vertices);
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		int hash_code = 17;
		
		// Ensuring that order is *IRRELEVANT*
		hash_code += 3 * v2.hashCode() - 1;
		hash_code += 3 * v3.hashCode() - 1;
		hash_code += 3 * v1.hashCode() - 1;
		
		// FIX HASHCODE FUNCTION FOR BOTH POLYGON AND MESH!!!
		//System.out.println(hash_code);
		assertEquals(polygon.hashCode(), hash_code);
		
	}
	
	// POLYGON TESTS (START) //
	
	
	
	// MESH TESTS (START) //
	
	@Test
	void mesh_setReader1()
	{
		Mesh mesh = new Mesh();
		
		mesh.setReader(new OBJMeshReader());
		
		assertTrue(mesh.reader instanceof OBJMeshReader);
	}
	
	@Test
	void mesh_setReader2()
	{
		Mesh mesh = new Mesh();
		
		PLYMeshReader ply_mesh_reader = new PLYMeshReader();
		
		mesh.setReader(ply_mesh_reader);
		
		assertEquals(mesh.reader, ply_mesh_reader);
	}
	
	@Test
	void mesh_setWriter1()
	{
		Mesh mesh = new Mesh();
		
		OBJMeshWriter obj_mesh_writer = new OBJMeshWriter();
		
		mesh.setWriter(obj_mesh_writer);
		
		assertEquals(mesh.writer, obj_mesh_writer);
	}
	
	@Test
	void mesh_setWriter2()
	{
		Mesh mesh = new Mesh();
		
		PLYMeshWriter ply_mesh_writer = new PLYMeshWriter();
		
		mesh.setWriter(ply_mesh_writer);
		
		assertEquals(mesh.writer, ply_mesh_writer);
	}
	
	@Test
	void mesh_readFromFile1()
	{
		Mesh mesh = new Mesh();
		
		String fileName = "not_a_valid_filetype.pdf";
		
		Throwable invalid_filetype_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Invalid filetype: no '.obj' nor '.ply' extension detected at end of file: " + fileName + ".", invalid_filetype_exception.getMessage());
	}
	
	@Test
	void mesh_readFromFile2() throws FileNotFoundException
	{
		Mesh mesh = new Mesh();
		
		String fileName = "a.obj";
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " was not found.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void mesh_readFromFile3() throws FileNotFoundException
	{
		Mesh mesh = new Mesh();
		
		String fileName = "a.ply";
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " was not found.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void mesh_writeToFile1()
	{
		Mesh mesh = new Mesh();
		
		String fileName = "not_a_valid_filetype.pdf";
		
		Throwable invalid_filetype_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.writeToFile(fileName);
	    });
		
		assertEquals("Invalid filetype: no '.obj' nor '.ply' extension detected at end of file: " + fileName + ".", invalid_filetype_exception.getMessage());
	}
	
	@Test
	void mesh_writeToFile2() throws IOException
	{
		Mesh mesh = new Mesh();
		
		String fileName = ".obj";
		
		mesh.writeToFile(fileName);
		
		assertTrue(mesh.writer instanceof OBJMeshWriter);
	}
	
	@Test
	void mesh_writeToFile3() throws IOException
	{
		Mesh mesh = new Mesh();
		
		String fileName = ".ply";
		
		mesh.writeToFile(fileName);
		
		assertTrue(mesh.writer instanceof PLYMeshWriter);
	}
	
	@Test
	void mesh_equals1()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		assertTrue(mesh.equals(mesh));
	}
	
	@Test
	void mesh_equals2()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		assertFalse(mesh.equals(null));
	}
	
	@Test
	void mesh_equals3()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		assertFalse(mesh.equals(polygon3));
	}
	
	@Test
	void mesh_equals4()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon1);
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		mesh1.setReader(new OBJMeshReader());
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals5()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon1);
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		mesh1.setReader(new OBJMeshReader());
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		mesh2.setReader(new PLYMeshReader());
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals6()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon1);
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		mesh1.setWriter(new OBJMeshWriter());
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals7()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon1);
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		mesh1.setWriter(new OBJMeshWriter());
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		mesh2.setWriter(new PLYMeshWriter());
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals8()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons1;
		
		assertTrue(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals9()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		Mesh mesh2 = new Mesh();
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals10()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals11()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon1);
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		assertFalse(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_equals12()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		LinkedHashSet<Polygon> polygons2 = new LinkedHashSet<Polygon>();
		
		polygons2.add(polygon2);
		polygons2.add(polygon4);
		polygons2.add(polygon3);
		polygons2.add(polygon1);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		mesh1.setReader(new OBJMeshReader());
		
		mesh1.setWriter(new PLYMeshWriter());
		
		Mesh mesh2 = new Mesh();
		
		mesh2.polygons = polygons2;
		
		mesh2.setReader(new OBJMeshReader());
		
		mesh2.setWriter(new PLYMeshWriter());
		
		assertTrue(mesh1.equals(mesh2));
	}
	
	@Test
	void mesh_hashCode()
	{
		Vertex vertex1 = new Vertex(0, Math.PI, 69.420);
		Vertex vertex2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		Mesh mesh1 = new Mesh();
		
		mesh1.polygons = polygons1;
		
		Vertex v1 = new Vertex(0, Math.PI, 69.420);
		Vertex v2 = new Vertex(420.69, Math.PI * Math.PI, 69420);
		Vertex v3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vert1 = new LinkedHashSet<Vertex>();
		
		vert1.add(v1);
		vert1.add(v2);
		vert1.add(v3);
		
		Polygon p1 = new Polygon(vert1);
		
		Vertex v4 = new Vertex(45, 5 + Math.PI * 9, 42.6909);
		Vertex v5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex v6 = new Vertex(98, 7, 6.5);
		
		LinkedHashSet<Vertex> vert2 = new LinkedHashSet<Vertex>();
		
		vert2.add(v4);
		vert2.add(v5);
		vert2.add(v6);
		
		Polygon p2 = new Polygon(vert2);
		
		Vertex v7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vert3 = new LinkedHashSet<Vertex>();
		
		vert3.add(v2);
		vert3.add(v5);
		vert3.add(v7);
		
		Polygon p3 = new Polygon(vert3);
		
		LinkedHashSet<Vertex> vert4 = new LinkedHashSet<Vertex>();
		
		vert4.add(v1);
		vert4.add(v6);
		vert4.add(v7);
		
		Polygon p4 = new Polygon(vert4);
		
		int hash_code = 11;
		hash_code *= p1.hashCode() + 1;
		hash_code *= p2.hashCode() + 1;
		hash_code *= p3.hashCode() + 1;
		hash_code *= p4.hashCode() + 1;
		
		
		assertEquals(mesh1.hashCode(), hash_code);
	}
	
	// MESH TESTS (END) //
	
	
	
	// OBJMESHREADER TESTS (START) //
	
	@Test
	void OBJMeshReader_read1() throws IOException
	{
		String fileName = directory + "obj_test_files/invalidFile.obj";
		
		Mesh mesh = new Mesh();
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " was not found.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void OBJMeshReader_read2() throws IOException
	{
		String fileName = directory + "obj_test_files/mesh1.obj";
		
		Mesh mesh = new Mesh();
		
		mesh.readFromFile(fileName);
		
		Vertex vertex1 = new Vertex(0, 3.14159, 69.420);
		Vertex vertex2 = new Vertex(420.69, 9.86960, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, -5.14159, -42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, -6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		Mesh file_mesh = new Mesh();
		
		file_mesh.polygons = polygons1;
		
		assertEquals(mesh.polygons, file_mesh.polygons);
	}
	
	@Test
	void OBJMeshReader_read3() throws IOException
	{
		String fileName = directory + "obj_test_files/mesh2.obj";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Vertex #" + 69420 + " does not exist in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void OBJMeshReader_read4() throws IOException
	{
		String fileName = directory + "obj_test_files/mesh3.obj";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Invalid data format at line " + 12 + " in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	// OBJMESHREADER TESTS (END) //
	
	
	
	// PLYMESHREADER TESTS (START) //
	
	@Test
	void PLYMeshReader_read1() throws IOException
	{
		String fileName = directory + "ply_test_files/invalidFile.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " was not found.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read2() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh_empty.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("File doesn't contain any vertices.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read3() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh_noPolygons.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable nonexistant_file_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("File doesn't contain any polygons.", nonexistant_file_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read4() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh1.ply";
		
		Mesh mesh = new Mesh();
		
		mesh.readFromFile(fileName);
		
		Vertex vertex1 = new Vertex(0.0, 3.14159, 69.420);
		Vertex vertex2 = new Vertex(420.69, 9.86960, 69420.0);
		Vertex vertex3 = new Vertex(90.0, 94.0, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45.0, -5.14159, -42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98.0, 7.0, -6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons1 = new LinkedHashSet<Polygon>();
		
		polygons1.add(polygon1);
		polygons1.add(polygon2);
		polygons1.add(polygon3);
		polygons1.add(polygon4);
		
		Mesh file_mesh = new Mesh();
		
		file_mesh.polygons = polygons1;
		
		assertEquals(mesh.polygons, file_mesh.polygons);
	}
	
	@Test
	void PLYMeshReader_read5() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh2.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Invalid data format at line " + 11 + " in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read6() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh3.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Invalid data format at line " + 18 + " in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read7() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh4.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Vertex #" + 69420 + " does not exist in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read8() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh5.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Unexpected data entry at line #" + 19 + "in file: " + fileName + ".", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read9() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh6.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " is not properly formatted.", invalid_vertexNum_exception.getMessage());
	}
	
	@Test
	void PLYMeshReader_read10() throws IOException
	{
		String fileName = directory + "ply_test_files/mesh7.ply";
		
		Mesh mesh = new Mesh();
		
		Throwable invalid_vertexNum_exception = assertThrows(IllegalArgumentException.class, () -> {
			mesh.readFromFile(fileName);
	    });
		
		assertEquals("Input file: " + fileName + " is not properly formatted.", invalid_vertexNum_exception.getMessage());
	}
	
	// PLYMESHREADER TESTS (END) //
	
	
	
	// OBJMESHWRITER TESTS (START) //
	
	@Test
	void OBJMeshWriter_write1() throws IOException
	{
		String fileName = directory + "obj_test_files/new_mesh1.obj";
		
		Vertex vertex1 = new Vertex(0, 3.14159, 69.420);
		Vertex vertex2 = new Vertex(420.69, 9.86960, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, -5.14159, -42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, -6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		polygons.add(polygon4);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		mesh.writeToFile(fileName);
		
		Mesh file_mesh = new Mesh();
		
		file_mesh.readFromFile(fileName);
		
		assertEquals(mesh.polygons, file_mesh.polygons);
	}
	
	// OBJMESHWRITER TESTS (END) //
	
	
	
	// PLYMESHWRITER TESTS (START) //
	
	@Test
	void PLYMeshWriter_write1() throws IOException
	{
		String fileName = directory + "ply_test_files/new_mesh1.ply";
		
		Vertex vertex1 = new Vertex(0, 3.14159, 69.420);
		Vertex vertex2 = new Vertex(420.69, 9.86960, 69420);
		Vertex vertex3 = new Vertex(90, 94, 31.1);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		
		vertices1.add(vertex1);
		vertices1.add(vertex2);
		vertices1.add(vertex3);
		
		Polygon polygon1 = new Polygon(vertices1);
		
		Vertex vertex4 = new Vertex(45, -5.14159, -42.6909);
		Vertex vertex5 = new Vertex(1.23, 14.14141414, 1100.4);
		Vertex vertex6 = new Vertex(98, 7, -6.5);
		
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices2.add(vertex4);
		vertices2.add(vertex5);
		vertices2.add(vertex6);
		
		Polygon polygon2 = new Polygon(vertices2);
		
		Vertex vertex7 = new Vertex(81.69, 69.74, 3.1415926535);
		
		LinkedHashSet<Vertex> vertices3 = new LinkedHashSet<Vertex>();
		
		vertices3.add(vertex2);
		vertices3.add(vertex5);
		vertices3.add(vertex7);
		
		Polygon polygon3 = new Polygon(vertices3);
		
		LinkedHashSet<Vertex> vertices4 = new LinkedHashSet<Vertex>();
		
		vertices4.add(vertex1);
		vertices4.add(vertex6);
		vertices4.add(vertex7);
		
		Polygon polygon4 = new Polygon(vertices4);
		
		LinkedHashSet<Polygon> polygons = new LinkedHashSet<Polygon>();
		
		polygons.add(polygon1);
		polygons.add(polygon2);
		polygons.add(polygon3);
		polygons.add(polygon4);
		
		Mesh mesh = new Mesh();
		
		mesh.polygons = polygons;
		
		mesh.writeToFile(fileName);
		
		Mesh file_mesh = new Mesh();
		
		file_mesh.readFromFile(fileName);
		
		assertEquals(mesh.polygons, file_mesh.polygons);
	}
	
	// PLYMESHWRITER TESTS (END) //

}
