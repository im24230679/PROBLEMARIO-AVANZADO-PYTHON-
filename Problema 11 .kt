#11.- Tangente a una curva: Dada una función y un punto, calcula la ecuación de la recta tangente en ese punto.

from sympy import symbols, diff

def tangente(f, x0):
    x = symbols('x')
    derivada = diff(f, x)
    m = derivada.subs(x, x0)
    b = f.subs(x, x0) - m * x0
    return m, b

expr = "x**2 - 4*x + 3"
x0 = 2
m, b = tangente(expr, x0)
print(f"Ecuación de la tangente: y = {m}x + {b}")
