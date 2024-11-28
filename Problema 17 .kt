#17. Números amigables: Escribe un programa para determinar si dos números dados son amigables (la suma de los divisores de uno es igual al otro y viceversa).


def suma_divisores(n):
    return sum(i for i in range(1, n) if n % i == 0)

def son_amigables(a, b):
    return suma_divisores(a) == b and suma_divisores(b) == a

print(son_amigables(220, 284))
