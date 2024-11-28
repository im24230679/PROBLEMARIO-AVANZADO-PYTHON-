#18. Factorización optimizada: Diseña una función para descomponer un número en sus factores primos de forma eficiente.

def factores_primos(n):
    factores = []
    i = 2
    while i * i <= n:
        while n % i == 0:
            factores.append(i)
            n //= i
        i += 1
    if n > 1:
        factores.append(n)
    return factores

print(factores_primos(56))
