# combinacion.py

def combinacion(n: int, k: int) -> int:
    """
    Calcula la combinación C(n, k) = n! / (k! (n-k)!)
    usando una forma multiplicativa eficiente.
    """
    if n < 0 or k < 0:
        raise ValueError("n y k deben ser enteros positivos")

    if k > n:
        return 0

    # Usar simetría para reducir operaciones: C(n,k)=C(n,n-k)
    k = min(k, n - k)

    if k == 0:
        return 1

    numer = 1  # parte de arriba
    denom = 1  # parte de abajo (k!)
    
    for i in range(1, k + 1):
        numer *= n - (k - i)
        denom *= i

    return numer // denom  # división exacta


def main():
    print("CÁLCULO DE COMBINACIÓN C(n,k)\n")

    n = int(input("Ingrese n (entero positivo): "))
    k = int(input("Ingrese k (entero positivo): "))

    resultado = combinacion(n, k)
    print(f"\nC({n}, {k}) = {resultado}")


if __name__
