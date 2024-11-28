#13. Autovalores y autovectores: Escribe un programa para calcular los autovalores de una matriz 2x2.

import numpy as np

def autovalores_autovectores(A):
    valores, vectores = np.linalg.eig(A)
    return valores, vectores

A = np.array([[4, 1], [2, 3]])
valores, vectores = autovalores_autovectores(A)
print(f"Autovalores: {valores}")
print(f"Autovectores: {vectores}")
