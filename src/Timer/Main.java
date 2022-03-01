package Timer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.setX(225);
        rectangle.setY(50);
        rectangle.setFill(Color.rgb(100, 150, 255, 0.55));


        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(100);
        circle.setStroke(Color.GREEN);
        circle.setFill(Color.TRANSPARENT);

        Line lineVerticalMid = new Line();
        lineVerticalMid.setStroke(Color.RED);
        lineVerticalMid.setStartX(250);
        lineVerticalMid.setStartY(0);
        lineVerticalMid.setEndX(250);
        lineVerticalMid.setEndY(500);

        Line lineHorizontalMid = new Line();
        lineHorizontalMid.setStroke(Color.GREEN);
        lineHorizontalMid.setStartX(0);
        lineHorizontalMid.setStartY(250);
        lineHorizontalMid.setEndX(500);
        lineHorizontalMid.setEndY(250);


        Line lineR2L = new Line();
        lineR2L.setStroke(Color.BLUE);
        lineR2L.setStartX(0);
        lineR2L.setStartY(0);
        lineR2L.setEndX(500);
        lineR2L.setEndY(500);

        Line lineL2R = new Line();
        lineL2R.setStroke(Color.YELLOWGREEN);
        lineL2R.setStartX(500);
        lineL2R.setStartY(0);
        lineL2R.setEndX(0);
        lineL2R.setEndY(500);


        Button button = new Button("Change Color");
        button.setMinWidth(50);
        button.setMinHeight(30);
        button.setLayoutX(205);
        button.setLayoutY(400);
        Random random = new Random();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int red = random.nextInt(0, 256);
                int green = random.nextInt(0, 256);
                int blue = random.nextInt(0, 256);
                rectangle.setFill(Color.rgb(red, green, blue));
            }
        });

        Pane pane = new Pane();
        pane.getChildren().addAll(lineVerticalMid, lineHorizontalMid, lineR2L, lineL2R, circle, rectangle, button);


        Scene scene = new Scene(pane, 500, 500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setTitle("Test FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
