#6.- Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la suma de los primeros N términos de la serie de Fibonacci.

def suma_fibonacci(n):
    a, b = 0, 1
    suma = a
    for _ in range(1, n):
        a, b = b, a + b
        suma += a
    return suma

print(suma_fibonacci(10))
