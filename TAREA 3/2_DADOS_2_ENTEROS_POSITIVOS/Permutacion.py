# permutacion.py

def permutacion(n: int, k: int) -> int:
    """
    Calcula la permutación P(n, k) = n! / (n-k)!
    mediante multiplicación descendente.
    """
    if n < 0 or k < 0:
        raise ValueError("n y k deben ser enteros positivos")
    
    if k > n:
        return 0

    resultado = 1
    for i in range(n, n - k, -1):  # n * (n-1) * ... * (n-k+1)
        resultado *= i

    return resultado


def main():
    print("CÁLCULO DE PERMUTACIÓN P(n,k)\n")

    n = int(input("Ingrese n (entero positivo): "))
    k = int(input("Ingrese k (entero positivo): "))

    resultado = permutacion(n, k)
    print(f"\nP({n}, {k}) = {resultado}")


if __name__ == "__main__":
    main()
