package Klausur_02_2022.Aufgabe_3;

public class Scheduler {

    void start(Thread t, Runnable r) throws InterruptedException {
        while (!t.isInterrupted()) {
            t = new Thread(r);
            t.start();

            if (t.isInterrupted()) {
                throw new InterruptedException();
            }
        }
    }
}
