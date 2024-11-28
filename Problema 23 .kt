#23.- Simulación de ondas: Dibuja la superposición de dos ondas.

import numpy as np
import matplotlib.pyplot as plt

def simular_ondas():
    # Parámetros
    t = np.linspace(0, 2 * np.pi, 400)  # Tiempo
    onda1 = np.sin(t)  # Primera onda
    onda2 = np.sin(t + np.pi / 4)  # Segunda onda con desfase

    # Graficar las ondas
    plt.plot(t, onda1, label="Onda 1: sin(t)")
    plt.plot(t, onda2, label="Onda 2: sin(t + π/4)")
    
    # Superposición de las dos ondas
    superposicion = onda1 + onda2
    plt.plot(t, superposicion, label="Superposición", linestyle="--", color="green")

    plt.legend()
    plt.grid(True)
    plt.title("Superposición de dos ondas")
    plt.show()

# Simular y graficar ondas
simular_ondas()
