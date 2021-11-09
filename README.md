# 3D Image Linear Transformer

In computer graphics, an object is usually represented by dividing its surface into a set of polygons (also called faces). Such a set is called a mesh.

In linear algebra, Linear Transformations can be used to redirect and alter every graphical element (such as vectors or matrices) within a Vector Space.

Conveniently, every valid Linear Transformation T: V -> W (where V and W are vector spaces) can be defined as a matrix A of size dim(W) x dim(V) (where dim(V) and dim(W) represent the dimensions of the Vector Spaces V and W, respectively).

From this knowledge, we can take graphical elements such as vertices, polygons and meshes and apply any desired Linear Transformation with the use of matrix algebra. To illustrate an example, we could take a vertex **v** = (Vx, Vy, Vz) and rotate it about the y axis by π/3 radians with the 3x3 Matrix:

Attempt | #1 | #2 | #3 | #4 | #5 | #6 | #7 | #8 | #9 | #10 | #11
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
Seconds | 301 | 283 | 290 | 286 | 289 | 285 | 287 | 287 | 272 | 276 | 269
