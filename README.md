# 3D Image Linear Transformer

In computer graphics, an object is usually represented by dividing its surface into a set of polygons called 'faces'. A set of faces is called a mesh.

In linear algebra, Linear Transformations can be used to redirect and alter graphical elements (such as vectors and matrices) within a Vector Space.

Conveniently, every valid Linear Transformation T: V -> W (where V and W are vector spaces) can be defined as a matrix A of size dim(W) x dim(V) (where dim(V) and dim(W) represent the dimensions of the Vector Spaces V and W, respectively).

From this knowledge, we can take graphical elements such as vertices, polygons and meshes and apply any desired Linear Transformation with the use of matrix algebra. To illustrate an example, we could take a vertex **v** = (Vx, Vy, Vz) and rotate it about the x axis by 𝜃 degrees with the 3x3 Matrix:

<img width="245" alt="Screen Shot 2021-11-09 at 1 47 16 PM" src="https://user-images.githubusercontent.com/86801013/140985771-2abb2cfe-ec5d-46e4-ac0b-137ff45aa5e5.png">

Such that **v** would then be transformed into:

<img width="434" alt="Screen Shot 2021-11-09 at 1 47 38 PM" src="https://user-images.githubusercontent.com/86801013/140985812-9cc79434-c5bb-4513-9828-afd489b3b99f.png">

In this program, I've defined each mesh as a set of polygons and each polygon as a set of vertices. I've defined a class named Vertex in Vertex.java, as well as a Polygon class in Polygon.java and a Mesh class in Mesh.java.

Each of these classes inherit from GraphicalObject.java, which has an abstract method named 'transform' that takes in a matrix as input. I have also defined three methods within GraphicalObject that may be used by any class that inherits from it: rotateXAxis, rotateYAxis and rotateZAxis.

These methods take a parameter 'angle_theta' of type double and simply call the abstract 'transform' method with the corresponding matrix (alongside the angle value from the input parameter) to the desired rotation transformation. For example, if rotateXAxis was called with π/3 as the input parameter, then the 'transform' method would be called with the previously illustrated matrix Rx(θ) (where θ = π/3) as its input parameter.

Now for the Vertex, Polygon and Mesh classes, as mentioned before they each inherit from (extend) GraphicalObject. Hence, they all 
