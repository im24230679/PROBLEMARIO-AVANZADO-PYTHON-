#22.- Visualización de raíces: Representa gráficamente un polinomio P(x) y

marca en la gráfica las raíces reales calculadas.

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
