#7. Derivadas simbólicas: Diseña una función que acepte una expresión algebraica (por ejemplo, 3x^2 + 2x) y calcule su derivada simbólica.

from sympy import symbols, diff

x = symbols ("x")
funcion = 3*x**2 + 2*x
print("Funcion:")
pprint(funcion)
funcion_derivada = diff(funcion, )
print ("Resultado")
pprint(funcion_derivada)
