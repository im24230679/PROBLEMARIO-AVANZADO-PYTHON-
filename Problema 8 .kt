#8.Aproximación de derivadas: Implementa una función que calcule la derivada de una función en un punto usando diferencias finitas.


def derivada_aproximada(f, x, h=1e-5):
    return (f(x + h) - f(x)) / h

def f(x):
    return x**2 + 2*x

print(derivada_aproximada(f, 2))
