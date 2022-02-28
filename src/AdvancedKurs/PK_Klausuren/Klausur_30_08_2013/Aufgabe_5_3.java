package AdvancedKurs.PK_Klausuren.Klausur_30_08_2013;

public class Aufgabe_5_3 {

    public static void main(String[] args) {
        Lager3 lager = new Lager3();
        Thread t1 = new Thread(new ProduzentThread3(lager));
        Thread t2 = new Thread(new KonsumentThread3(lager));
    }
}

class Lager3 {

    private int bestand;
    private static final int kapazität = 20;

    public synchronized void einlagern() {
        if (bestand + 5 <= kapazität) {
            bestand += 5;
            System.out.println("nach Einlagern :" + bestand);
        }
    }

    public synchronized void entnehmen() {
        if (bestand - 3 >= 0) {
            bestand -= 3;
            System.out.println("nach Entnehmen :" + bestand);
        }
    }

    public boolean isEmpty() {
        return bestand == 0;
    }

    public boolean isFull() {
        return bestand == kapazität;
    }
}

class ProduzentThread3 extends Thread {

    private final Lager3 lager;

    ProduzentThread3(Lager3 lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        while (true) {
            lager.einlagern();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}

class KonsumentThread3 extends Thread {

    private final Lager3 lager;

    public KonsumentThread3(Lager3 lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        while (true) {
            lager.entnehmen();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
