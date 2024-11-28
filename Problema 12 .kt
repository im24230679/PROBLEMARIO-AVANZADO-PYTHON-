#12. Resolución de sistemas lineales: Implementa una función que resuelva un sistema de ecuaciones lineales usando el método de eliminación de Gauss.

import numpy as np

def resolver_sistema(A, b):
    A = np.array(A, dtype=float)
    b = np.array(b, dtype=float)
    n = len(A)
    for i in range(n):
        A[i] = A[i] / A[i, i]
        b[i] = b[i] / A[i, i]
        for j in range(i + 1, n):
            factor = A[j, i]
            A[j] -= factor * A[i]
            b[j] -= factor * b[i]
    x = np.zeros(n)
    for i in range(n-1, -1, -1):
        x[i] = b[i] - np.dot(A[i, i+1:], x[i+1:])
    return x

A = [[2, -1, 1], [1, 3, 2], [3, 1, 2]]
b = [1, 12, 10]
print(resolver_sistema(A, b))
