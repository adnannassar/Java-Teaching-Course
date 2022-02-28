package Klausur_02_2022.Aufgabe_4;


import Klausur_02_2022.Aufgabe_2.Car;
import Timer.ModalStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PriceInfoView extends ModalStage {
    private Car car;
    public PriceInfoView(Stage primaryStage , Car car) {
        super(primaryStage);
        this.initOwner(primaryStage);
        this.initModality(Modality.WINDOW_MODAL);
        this.car = car;
    }

    public void showView() {
        Label model = new Label("Model");
        Label price = new Label("Price");
        HBox hBox1 = new HBox(30);
        hBox1.getChildren().addAll(model, price);
        Label model2 = new Label("Model");
        Label price2 = new Label("Price");
        HBox hBox2 = new HBox(30);
        hBox2.getChildren().addAll(model2, price2);
        HBox hBox3 = new HBox();
        Button ok = new Button("Ok");
        hBox3.setAlignment(Pos.CENTER);
        hBox1.getChildren().add(ok);
        VBox vBox = new VBox(30);
        vBox.getChildren().addAll(hBox1, hBox2);
        BorderPane bp = new BorderPane(vBox);
        bp.setPadding(new Insets(15));
        bp.setBottom(hBox3);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price2.setText(String.valueOf(car.getPrice()));
                model2.setText(car.getModel());
            }
        });
        Scene scene = new Scene(bp, 400, 400);
        setScene(scene);
        setTitle("Farbe-Test");
        show();
    }
}
