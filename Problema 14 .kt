#14. Multiplicación de matrices grandes: Implementa un algoritmo para multiplicar dos matrices dispersas eficientemente.

import numpy as np

def multiplicar_matrices(A, B):
    return np.dot(A, B)

A = np.array([[1, 2], [3, 4]])
B = np.array([[5, 6], [7, 8]])
print(multiplicar_matrices(A, B))
