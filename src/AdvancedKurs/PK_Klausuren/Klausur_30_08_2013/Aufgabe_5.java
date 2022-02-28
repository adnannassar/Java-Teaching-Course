package AdvancedKurs.PK_Klausuren.Klausur_30_08_2013;





public class Aufgabe_5 {

    public static void main(String[] args) {
        Lager lager = new Lager();
        Thread pt = new Thread(new ProduzentThread(lager));
        Thread kt = new Thread(new KonsumentThread(lager));
        pt.start();
        kt.start();
    }
}

class Lager {

    private int bestand;
    private static final int kapazität = 20;

    public void einlagern() {
        if (bestand + 5 <= kapazität) {
            bestand += 5;
            System.out.println("nach Einlagern :" + bestand);
        }
    }

    public void entnehmen() {
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

class ProduzentThread extends Thread {

    private final Lager lager;

    ProduzentThread(Lager lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lager) {
                while (lager.isFull()) {
                    try {
                        lager.wait();
                    } catch (InterruptedException e) {
                    }
                }
                lager.einlagern();
                lager.notifyAll();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

        }
    }
}

class KonsumentThread extends Thread {

    private final Lager lager;

    public KonsumentThread(Lager lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lager) {
                while(lager.isEmpty()) {
                    try {
                        lager.wait();
                    } catch (InterruptedException ex) {
                    }
                }
                lager.entnehmen();
                lager.notifyAll();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }

    }
}
