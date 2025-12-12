def factores_primos(n):
    factores = []
    divisor = 2
    while divisor * divisor <= n:
        while n % divisor == 0:
            factores.append(divisor)
            n //= divisor
        divisor += 1
    if n > 1:
        factores.append(n)
    return factores

# Ejemplo
numero = 84
print(f"Factores primos de {numero}: {factores_primos(numero)}")
