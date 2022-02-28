package AdvancedKurs.PK_Klausuren.Klausur_31_08_2021.Aufgabe_3;

import java.io.DataOutputStream;

public class PrimeUtilConcurrent extends PrimeUtil implements Runnable {
    private PrimeListener primeListener;
    int n;
    public PrimeUtilConcurrent(DataOutputStream out) {
        super(out);
    }

    @Override
    public void calcPrimeNr(int n) {
        this.n = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            super.calcPrimeNr(n);
            try {
                Thread.currentThread().join();
                primeListener.nextPrime();
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }
    }
}
