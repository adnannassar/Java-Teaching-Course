package AdvancedKurs.PK_Klausuren.Klausur_30_08_2013;

public class Aufgabe_5_2 {

    public static void main(String[] args) {
        Lager3 lager = new Lager3();
        Thread t1 = new Thread(new ProduzentThread3(lager));
        Thread t2 = new Thread(new KonsumentThread3(lager));
        t1.start();
        t2.start();
    }
}

class Lager2 {

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
  
}

// CLASS ProduzentThread2
class ProduzentThread2 implements Runnable {
    private Lager2 lager2;

    ProduzentThread2(Lager2 lager) {
        this.lager2 = lager;
    }

    public void run() {
        while (true) {
            lager2.einlagern();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }
    }
}

// CLASS KonsumentThread2
class KonsumentThread2 implements Runnable {

    private Lager2 lager2;

    public KonsumentThread2(Lager2 lager) {
        this.lager2 = lager;
    }

    @Override
    public void run() {
        while (true) {
            lager2.entnehmen();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }

    }

}
