# 2.- Fibonacci generalizado: Crea una función que reciba dos números iniciales y calcule una serie similar a Fibonacci, pero con estos números como punto de partida.

def fibonacci_generalizado(a, b, n):
    fib = [a, b]
    for i in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib

print(fibonacci_generalizado(3, 5, 10))
