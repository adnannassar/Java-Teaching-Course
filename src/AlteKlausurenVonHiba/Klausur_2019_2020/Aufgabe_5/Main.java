package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_5;

public class Main {
    public static void main(String[] args) {

        String s1 = "Hallo";
        String s2 = "Welt!";
        String s3 = s1 + " " + s2;
        System.out.print(s3.equals("Hallo Welt!"));
        long factorilaOFN;
        // a
        for (int n = 12; n >= -4; n = n - 4) {
            System.out.println(n * 3);
        }
        System.out.println("--------------------");
        /*
        int n = 12;
        while (n >= -4) {
            System.out.println(n * 3);
            n = n - 4;
        }
        */

        // b
        /*
        int m = 1;
        int n = 49;
        do {
            m *= 7;
            System.out.println(m);
            n -= m * 2;
        } while (n >= 42 && n >10);
         */


        for (int m = 1, n = 49; n >= 42; m *= 7, n -= m * 2) {
            System.out.println(m);
        }

        // C Test
        System.out.println("C Test: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(calc(2, 2, i));
        }
    }

    // C
    public static double calc(double kp, double zs, int n) {
        if (n == 0) {
            return kp;
        }
        return calc(kp, zs, n - 1) * (1 + zs);
    }
}
