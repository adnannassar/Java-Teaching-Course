package Timer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label msg = new Label("Hallo");
        msg.setFont(new Font(50));

        Pane p = new Pane();
        p.getChildren().add(msg);
        Scene scene = new Scene(p, 300, 300);

        primaryStage.setTitle("Test FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
