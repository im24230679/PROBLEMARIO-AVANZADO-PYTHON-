#21.-Pendiente y tangente: Grafica una función 
#f(x) =x²-422+62 como y, en el mismo gráfico, 
# muestra la recta tangente en un punto dado.

import numpy as np
import matplotlib.pyplot as plt

def grafica_tangente(f, x0):
    # Derivada de la función
    def derivada(f, x0, h=1e-5):
        return (f(x0 + h) - f(x0)) / h

    # Definir la ecuación de la tangente
    m = derivada(f, x0)  # Pendiente
    b = f(x0) - m * x0   # Intersección en y
    tangente = lambda x: m * x + b

    # Rango para graficar
    x_vals = np.linspace(x0 - 5, x0 + 5, 400)
    y_vals = f(x_vals)
    y_tangente = tangente(x_vals)

    # Graficar la función y la tangente
    plt.plot(x_vals, y_vals, label="f(x) = x² - 422 + 62")
    plt.plot(x_vals, y_tangente, label="Tangente en x = " + str(x0), linestyle="--")
    plt.scatter(x0, f(x0), color="red")  # Punto de tangencia
    plt.legend()
    plt.grid(True)
    plt.show()

# Función f(x) = x² - 422 + 62
def f(x):
    return x**2 - 422 + 62

# Graficar tangente en x0 = 10
grafica_tangente(f, 10)

#22.-

import numpy as np
import matplotlib.pyplot as plt

def grafica_raices_polinomio(coef):
    # Crear un polinomio a partir de los coeficientes
    p = np.poly1d(coef)

    # Encontrar las raíces
    raices = np.roots(coef)

    # Crear un rango de valores de x para graficar
    x_vals = np.linspace(-10, 10, 400)
    y_vals = p(x_vals)

    # Graficar el polinomio
    plt.plot(x_vals, y_vals, label="P(x)")
    
    # Marcar las raíces
    for r in raices:
        plt.scatter(r, 0, color='red', label=f"Raíz: {r}")
    
    plt.axhline(0, color='black',linewidth=0.5)
    plt.axvline(0, color='black',linewidth=0.5)
    plt.legend()
    plt.grid(True)
    plt.show()

# Coeficientes de un polinomio: P(x) = x³ - 6x² + 11x - 6
coef = [1, -6, 11, -6]
grafica_raices_polinomio(coef)
