package AdvancedKurs.FX;

import AdvancedKurs.Bild;
import AdvancedKurs.MedienverwaltungTypsicher;
import AdvancedKurs.Medium;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MedienVerwaltungFX extends Application {
    MedienverwaltungTypsicher mv = new MedienverwaltungTypsicher();
    Bild bild;
    ListView<Medium> listView;

    @Override
    public void start(Stage stage) throws Exception {
        mv.laden();
        MenuBar menuBar = new MenuBar();

        Menu dateiMenu = new Menu("Datei");

        MenuItem ladenItem = new MenuItem("Laden");
        MenuItem speichernItem = new MenuItem("Speichern");
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        MenuItem listInDateiItem = new MenuItem("MedienList in Datei");
        SeparatorMenuItem separator2 = new SeparatorMenuItem();
        MenuItem beendenItem = new MenuItem("Beenden");

        dateiMenu.getItems().addAll(ladenItem, speichernItem, separator1, listInDateiItem, separator2, beendenItem);


        Menu mediumMenu = new Menu("Medium");
        MenuItem audioNeuItem = new MenuItem("Audio neu");
        MenuItem bildNeuItem = new MenuItem("Bild neu");
        mediumMenu.getItems().addAll(audioNeuItem, bildNeuItem);

        Menu anzeigeMenu = new Menu("Anzeige");
        MenuItem zeigeAllMedienItem = new MenuItem("Zeige alle Medien");
        MenuItem erscheinungItem = new MenuItem("Erscheinungsjahr");
        MenuItem neusteMediumItem = new MenuItem("Neustes Medium");
        anzeigeMenu.getItems().addAll(zeigeAllMedienItem, erscheinungItem, neusteMediumItem);

        menuBar.getMenus().addAll(dateiMenu, mediumMenu, anzeigeMenu);


        Button audioAufnehmen = new Button("1");
        Label label1 = new Label("Audio Aufnehmen");
        HBox hBox1 = new HBox(15);
        hBox1.getChildren().addAll(audioAufnehmen, label1);

        Button bildAufnehmen = new Button("2");
        bildAufnehmen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                bild = new Bild();
                new BildErfassungView(stage, bild).showView();
                mv.aufnehmen(bild);
                refreshListView();
            }
        });
        Label label2 = new Label("Bild Aufnehmen");
        HBox hBox2 = new HBox(15);
        hBox2.getChildren().addAll(bildAufnehmen, label2);

        Button zeigeAlleMedien = new Button("3");
        zeigeAlleMedien.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mv.zeigeMedien(System.out);
            }
        });

        Label label3 = new Label("Zeige alle Medien");
        HBox hBox3 = new HBox(15);
        hBox3.getChildren().addAll(zeigeAlleMedien, label3);

        Button listeIndDateiSpeichern = new Button("4");
        Label label4 = new Label("Medienliste in einer Text-Datei schreiben");
        HBox hBox4 = new HBox(15);
        hBox4.getChildren().addAll(listeIndDateiSpeichern, label4);


        Button listeSpeichern = new Button("5");
        Label label5 = new Label("Medienliste Speichern");
        HBox hBox5 = new HBox(15);
        hBox5.getChildren().addAll(listeSpeichern, label5);

        Button listeLaden = new Button("6");
        Label label6 = new Label("Medienliste Laden");
        HBox hBox6 = new HBox(15);
        hBox6.getChildren().addAll(listeLaden, label6);


        Button zeigeNeuesMedien = new Button("7");
        Label label7 = new Label("Zeige neues Medium");
        HBox hBox7 = new HBox(15);
        hBox7.getChildren().addAll(zeigeNeuesMedien, label7);

        Button durchschnitt = new Button("8");
        Label label8 = new Label("Berechne durchschnittliches Erscheinungsjahr");
        HBox hBox8 = new HBox(15);
        hBox8.getChildren().addAll(durchschnitt, label8);

        Button beenden = new Button("9");
        beenden.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
        Label label9 = new Label("Beenden");
        HBox hBox9 = new HBox(15);
        hBox9.getChildren().addAll(beenden, label9);

        VBox vBox = new VBox(15);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8, hBox9);
        vBox.setPadding(new Insets(15));


        BorderPane bp = new BorderPane();
        bp.setTop(menuBar);
        bp.setLeft(vBox);

        listView = new ListView<>();
        listView.getItems().addAll(mv.medien);

        bp.setBottom(listView);

        Scene scene = new Scene(bp, 500, 800);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Medien Verwaltung FX");
        stage.setScene(scene);
        stage.show();

    }

    private void refreshListView(){
        listView.getItems().clear();
        listView.getItems().addAll(mv.medien);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
