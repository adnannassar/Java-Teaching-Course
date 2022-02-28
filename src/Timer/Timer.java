package Timer;

public class Timer implements Runnable {

    TimeListener timeListener;
    int delay;

    public Timer(TimeListener timeListener, int delay) {
        this.timeListener = timeListener;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(delay);
                timeListener.signalPerformed();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}
