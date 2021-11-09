# 3D Image Linear Transformer

In computer graphics, an object is usually represented by dividing its surface into a set of polygons (also called faces). Such a set is called a mesh.

In linear algebra, Linear Transformations can be used to redirect and alter every graphical element (such as vectors or matrices) within a Vector Space.

Conveniently, every valid Linear Transformation T: V -> W (where V and W are vector spaces) can be defined as a matrix A of size dim(W) x dim(V) (where dim(V) and dim(W) represent the dimensions of the Vector Spaces V and W, respectively).

From this knowledge, we can take graphical elements such as vertices, polygons and meshes and apply any desired Linear Transformation with the use of matrix algebra. To illustrate an example, we could take a vertex **v** = (Vx, Vy, Vz) and rotate it about the x axis by 𝜃 degrees with the 3x3 Matrix:

<img width="245" alt="Screen Shot 2021-11-09 at 1 47 16 PM" src="https://user-images.githubusercontent.com/86801013/140985771-2abb2cfe-ec5d-46e4-ac0b-137ff45aa5e5.png">

Such that v would then be transformed into
<img width="434" alt="Screen Shot 2021-11-09 at 1 47 38 PM" src="https://user-images.githubusercontent.com/86801013/140985812-9cc79434-c5bb-4513-9828-afd489b3b99f.png">
