#20. Gráfica de Fibonacci acumulativo: Genera una gráfica de barras donde el eje X representa los índices de la serie de Fibonacci 
#el eje Y la suma acumulada de los términos hasta ese indice. 

import matplotlib.pyplot as plt

def fibonacci_acumulado(n):
    a, b = 0, 1
    fib = [a]
    for _ in range(n - 1):
        a, b = b, a + b
        fib.append(a)
    return fib
