# 3D Image Linear Transformer

In computer graphics, an object is usually represented by dividing its surface into a set of polygons (also called faces). Such a set is called a mesh.

In linear algebra, Linear Transformations can be used to redirect and alter every graphical element (such as vectors or matrices) within a Vector Space.

Conveniently, every valid Linear Transformation T: V -> W (where V and W are vector spaces) can be defined as a matrix A of size dim(W) x dim(V) (where dim(V) and dim(W) represent the dimensions of the Vector Spaces V and W, respectively).

From this knowledge, we can take graphical elements such as vertices, polygons and meshes and apply any desired Linear Transformation with the use of matrix algebra. To illustrate an example, we could take a vertex **v** = (Vx, Vy, Vz) and rotate it about the y axis by 𝜃 degrees with the 3x3 Matrix:

<img width="240" alt="Screen Shot 2021-11-09 at 1 46 36 PM" src="https://user-images.githubusercontent.com/86801013/140985670-9c695c1b-3578-457b-9f86-dfe0cd3355ca.png">

