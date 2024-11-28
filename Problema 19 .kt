#19. Número de caminos: Calcula el número de caminos posibles en una cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo.

def caminos(n):
    return (2 * n) * (2 * n - 1) // 2

print(caminos(3))
