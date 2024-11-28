#4.-Fibonacci y primos: Encuentra el número más cercano a un indice N en la serie de Fibonacci que también sea primo.

def es_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def fibonacci_primo(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
        if es_primo(a):
            return a
    return None

print(fibonacci_primo(10))
