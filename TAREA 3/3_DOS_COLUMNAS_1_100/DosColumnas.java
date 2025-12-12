public class DosColumnas {
    public static void main(String[] args) {

        System.out.println("Col1\tCol2");

        for(int i = 1; i <= 100; i++) {   // i va del 1 al 100
            int j = 101 - i;             // j va del 100 al 1
            System.out.println(i + "\t" + j);
        }
    }
}
