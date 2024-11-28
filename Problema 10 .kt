#10. Cálculo numérico de integrales: Diseña una función para calcular la integral definida de una función en un intervalo utilizando el método del trapecio.

def integral_trapecio(f, a, b, n=1000):
    h = (b - a) / n
    suma = (f(a) + f(b)) / 2
    for i in range(1, n):
        suma += f(a + i * h)
    return suma * h

def f(x):
    return x**2

print(integral_trapecio(f, 0, 1))
