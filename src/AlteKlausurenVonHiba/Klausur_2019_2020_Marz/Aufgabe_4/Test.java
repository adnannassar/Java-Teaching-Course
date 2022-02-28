package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_4;

public class Test {
    public static void main(String[] args) {

        /*
        Aufgabe 3
        int a = 21;
        while (a >= 0) {
            a = a - 7;
            System.out.println(a * 3);
        }

        for (int a = 21; a >= 0; a -= 7) {
            System.out.println(a * 3);
        }
         */

        /*
        int m = 1;
        for (int n = 110; n >= 0; n -= m * 2) {
            m *= 5;
        }
        int n = 110;
        int m = 1;

        do{
            m *= 5;
            n -= m * 2;
        }while (n >= 0);
         */
        //  Aufgabe 4
        for (int i = 1; i <= 50; i++) {
            System.out.println("i:" + i + " --> " + calc(i));
        }
    }

    public static int calc(int n) {
        if (n <= 9) {
            return n;
        } else {
            return calc(calc(n / 10) + n % 10);
        }

    }
}
