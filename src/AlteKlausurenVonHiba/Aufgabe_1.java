package AlteKlausurenVonHiba;

public class Aufgabe_1 {
    private static final int MAX_PLAETZE = 5;
    private static int[] plaetze = new int[MAX_PLAETZE];

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        for (int i = 0; i < MAX_PLAETZE; i++) {
            plaetze[(x * i) % MAX_PLAETZE] = i;
        }

        System.out.println("................");
        for (int i = 0; i < MAX_PLAETZE; i++) {
            System.out.print( plaetze[i] + "\t");
        }
        System.out.println();
    }
}
