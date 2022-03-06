package AdvancedKurs.FX;

import AdvancedKurs.Bild;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BildErfassungView extends Stage {
    private Bild bild;

    public BildErfassungView(Stage parentStage, Bild bild) {
        this.bild = bild;
        this.initOwner(parentStage);
        this.initModality(Modality.WINDOW_MODAL);
    }

    public void showView() {
        Label titleLabel = new Label("Title");
        TextField titleTextField = new TextField();
        HBox hBox1 = new HBox(15);
        hBox1.getChildren().addAll(titleLabel, titleTextField);

        Label ortLabel = new Label("Ort");
        TextField ortTextField = new TextField();
        HBox hBox2 = new HBox(15);
        hBox2.getChildren().addAll(ortLabel, ortTextField);

        Label jahrLabel = new Label("Aufnahme Jahr");
        TextField jahrTextField = new TextField();
        HBox hBox3 = new HBox(15);
        hBox3.getChildren().addAll(jahrLabel, jahrTextField);

        Button neu = new Button("Neu");

        neu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String title = titleTextField.getText();
                String ort = ortTextField.getText();
                int jahr = Integer.parseInt(jahrTextField.getText());

                bild.setTitel(title);
                bild.setOrt(ort);
                bild.setJahr(jahr);

                closeStage(actionEvent);
            }
        });
        Button abbrechen = new Button("Abbrechen");
        abbrechen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                closeStage(actionEvent);
            }
        });
        HBox hBox4 = new HBox(15);
        hBox4.getChildren().addAll(neu, abbrechen);

        VBox vBox = new VBox(15);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4);
        vBox.setPadding(new Insets(15));
        Pane pane = new Pane();
        pane.getChildren().add(vBox);

        Scene scene = new Scene(pane, 300, 200);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        this.setScene(scene);
        this.setTitle("Bilderfassung");
        this.showAndWait();
    }

    public Bild getBild() {
        return bild;
    }

    public void setBild(Bild bild) {
        this.bild = bild;
    }

    private void closeStage(ActionEvent actionEvent){
        Node node = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.close();
    }
}
