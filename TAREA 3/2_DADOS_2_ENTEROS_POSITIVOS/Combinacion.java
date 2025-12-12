// Combinacion.java
import java.math.BigInteger;
import java.util.Scanner;

public class Combinacion {

    public static BigInteger combinacion(int n, int k) {
        if (n < 0 || k < 0)
            throw new IllegalArgumentException("n y k deben ser positivos");

        if (k > n)
            return BigInteger.ZERO;

        k = Math.min(k, n - k); // C(n,k) == C(n,n-k)

        if (k == 0)
            return BigInteger.ONE;

        BigInteger numer = BigInteger.ONE;
        BigInteger denom = BigInteger.ONE;

        for (int i = 1; i <= k; i++) {
            numer = numer.multiply(BigInteger.valueOf(n - (k - i)));
            denom = denom.multiply(BigInteger.valueOf(i));
        }

        return numer.divide(denom);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CÁLCULO DE COMBINACIÓN C(n,k)");
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        System.out.print("Ingrese k: ");
        int k = sc.nextInt();

        BigInteger resultado = combinacion(n, k);

        System.out.println("\nC(" + n + ", " + k + ") = " + resultado);
        sc.close();
    }
}
