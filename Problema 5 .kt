#5.- Factorial: Pedir por teclado N y calcular el Factorial de N (N! 1*2*3**N)

def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

n = int(input("Introduce un número para calcular su factorial: "))
print(factorial(n))
