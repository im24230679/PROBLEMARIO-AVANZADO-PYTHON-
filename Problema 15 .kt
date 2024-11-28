#15. Determinante de una matriz: Crea una función que calcule el determinante de matrices de hasta 4x4.

import numpy as np

def determinante_matriz(A):
    return np.linalg.det(A)

A = np.array([[4, 2], [3, 1]])
print(determinante_matriz(A))
