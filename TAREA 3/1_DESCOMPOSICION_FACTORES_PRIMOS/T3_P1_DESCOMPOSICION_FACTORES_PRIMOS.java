import java.util.Scanner;

public class T3_P1_DESCOMPOSICION_FACTORES_PRIMOS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        System.out.print("Factores primos: ");
        descomponerEnPrimos(numero);
    }

    public static void descomponerEnPrimos(int n) {

        // 1. Extraer todos los factores 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // 2. Extraer factores impares desde 3 hasta √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // 3. Si queda un número mayor que 2, es primo
        if (n > 2) {
            System.out.print(n);
        }
    }
}
