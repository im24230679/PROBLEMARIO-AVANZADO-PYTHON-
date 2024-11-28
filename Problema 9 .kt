#9.- Optimización de funciones: Escribe un programa que encuentre el mínimo o máximo de una función cuadrática mediante el cálculo de su derivada.
  
def minimo_funcion(f, a, b, h=1e-5):
    while abs(f(a) - f(b)) > h:
        mid = (a + b) / 2
        if f(mid) < f(a) and f(mid) < f(b):
            return mid
        elif f(mid) > f(a):
            b = mid
        else:
            a = mid
    return (a + b) / 2

def f(x):
    return x**2 - 4*x + 3

print(minimo_funcion(f, -2, 5))
