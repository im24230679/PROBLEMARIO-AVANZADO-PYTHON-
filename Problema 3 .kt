#3.- Posición en Fibonacci: Escribe una función que determine si un número dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

def posicion_fibonacci(num):
    a, b = 0, 1
    pos = 1
    while b < num:
        a, b = b, a + b
        pos += 1
    return pos if b == num else -1

print(posicion_fibonacci(21))
