// Permutacion.java
import java.math.BigInteger;
import java.util.Scanner;

public class Permutacion {

    public static BigInteger permutacion(int n, int k) {
        if (n < 0 || k < 0)
            throw new IllegalArgumentException("n y k deben ser positivos");

        if (k > n)
            return BigInteger.ZERO;

        BigInteger result = BigInteger.ONE;

        for (int i = n; i > n - k; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CÁLCULO DE PERMUTACIÓN P(n,k)");
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese k: ");
        int k = sc.nextInt();

        BigInteger resultado = permutacion(n, k);

        System.out.println("\nP(" + n + ", " + k + ") = " + resultado);
        sc.close();
    }
}
