package Timer;

import javafx.application.Application;
import javafx.stage.Stage;

public class Zeitansage extends Application implements TimeListener {

    int counter = 0;

    @Override
    public void signalPerformed() {
        System.out.println("Program run since ( " + counter++ + " ) seconds");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Thread t = new Thread(new Timer(this, 1000));
        t.start();
        MessageView.create(stage, "Threads", "STOP").showView();
        t.interrupt();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
