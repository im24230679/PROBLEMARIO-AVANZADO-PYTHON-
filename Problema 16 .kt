#16. Raíces de polinomios: Diseña un programa que encuentre todas las raíces reales de un polinomio de tercer grado.

import numpy as np

def raices_polinomio(coef):
    return np.roots(coef)

coef = [1, -6, 11, -6]  # x^3 - 6x^2 + 11x - 6
print(raices_polinomio(coef))
