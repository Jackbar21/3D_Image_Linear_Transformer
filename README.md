# 3D Image Linear Transformer

In computer graphics, an object is usually represented by dividing its surface into a set of polygons called 'faces'. A set of faces is called a mesh.

In linear algebra, Linear Transformations can be used to redirect and alter graphical elements (such as vectors and matrices) within a Vector Space.

Conveniently, every valid Linear Transformation T: V -> W (where V and W are vector spaces) can be defined as a matrix A of size dim(W) x dim(V) (where dim(V) and dim(W) represent the dimensions of the Vector Spaces V and W, respectively).

From this knowledge, we can take graphical elements such as vertices, polygons and meshes and apply any desired Linear Transformation with the use of matrix algebra. To illustrate an example, we could take a vertex **v** = (Vx, Vy, Vz) and rotate it about the x axis by 𝜃 degrees with the 3x3 Matrix:

<img width="245" alt="Screen Shot 2021-11-09 at 1 47 16 PM" src="https://user-images.githubusercontent.com/86801013/140985771-2abb2cfe-ec5d-46e4-ac0b-137ff45aa5e5.png">

Such that **v** would then be transformed into:

<img width="434" alt="Screen Shot 2021-11-09 at 1 47 38 PM" src="https://user-images.githubusercontent.com/86801013/140985812-9cc79434-c5bb-4513-9828-afd489b3b99f.png">

In this program, I've defined each mesh as a set of polygons and each polygon as a set of vertices. In total, I have defined exactly six classes and two interfaces in their respective files (i.e. the Vertex class is in the Vertex.java file).

They are defined as follows:

**1.) GraphicalObject** - An abstract class that represents graphical objects (such as vertices and polygons) that can be transformed using a matrix. It has the following **void** methods:

    a.) transform: an abstract method that takes a two-dimensional matrix of type double as its only parameter.
    
    b.) rotateXAxis: a concrete method that rotates the graphical object around the x-axis. It takes in one 
        parameter of type double representing the angle θ.
        
    c.) rotateYAxis: a concrete method that rotates the graphical object around the y-axis. It takes in one 
        parameter of type double representing the angle θ.
    
    d.) rotateZAxis: a concrete method that rotates the graphical object around the z-axis. It takes in one 
        parameter of type double representing the angle θ.
        
        
**2.) Vertex** - A concrete class that represents a point (x, y, z) in 3-dimensional space. It is defined as follows:

    a.) It has three fields of type double representing the x, y and z coordinates of the vertex (in 3-dimensional space).
    
    b.) It has a constructor that takes three parameters of type double and initializes the coordinate fields accordingly.
        
    c.) It inherits from the GraphicalObject class.
    
    d.) It overrides hashCode and equals and redesigns them appropriately for this program.
    
    e.) It overrides toString by returning a string containing the three coordinates seperated by a space (e.g. "x y z").
    
    f.) It overrides transform by taking the 3x3 matrix parameter and updating the Vertex's fields to their corresponding 
        values after applying the Linear Transformation (i.e. treating the x, y and z fields as a 3x1 matrix and multiplying 
        the 3x3 input matrix from the left and updating the fields to reflect their new values).
    
    
**3.) Polygon** - A concrete class that represents a multi-sided polygon as a set of vertices (from Vertex) in 3-dimensional space. It is defined as follows:

    a.) It has one field of type LinkedHashSet<Vertex> named vertices. 
    
    b.) It has a constructor that takes one parameter of type LinkedHashSet<Vertex> and initializes the vertices field accordingly.
        
    c.) It inherits from the GraphicalObject class.
    
    d.) It overrides hashCode and equals and redesigns them appropriately for this program.
    
    e.) It overrides toString by r
