package AdvancedKurs;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    MedienverwaltungTypsicher mv;

    public Menu(MedienverwaltungTypsicher mv) {
        this.mv = mv;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 9) {
            System.out.println(
                    "1. Audio aufnehmen\n" +
                            "2. Bild aufnehmen\n" +
                            "3. Zeige alle Medien\n" +
                            "4. Medienliste in einer Text-Datei schreiben\n" +
                            "5. Medienliste Speichern\n" +
                            "6. Medienliste Laden\n" +
                            "7. Zeige neues Medium\n" +
                            "8. Berechne durchschnittliches Erscheinungsjahr\n" +
                            "9. Beenden");
            System.out.println("Bitte Menuepunkt waehlen:");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(null, "Bitte nur Zahlen eingeben");
                sc.nextLine();
            }

            switch (option) {
                case 1:
                    addAudio();
                    break;
                case 2:
                    addBild();
                    break;
                case 3:
                    mv.zeigeMedien(System.out);
                    System.out.println();
                    break;
                case 4:
                    boolean dateiNameIstGültig = false;
                    do {
                        String fileName = JOptionPane.showInputDialog(null, "Bitte Dateiname eingeben");
                        if (fileName == null) {
                            break;
                        }
                        if (fileName.length() == 0) {
                            int auswahl = JOptionPane.showConfirmDialog(null, "Dateinamen ist leer! Neuen Dateinamen wählen?", "Hinweis", JOptionPane.YES_NO_OPTION);
                            // yes = 0, no = 1
                            if (auswahl == 1) {
                                break;
                            }
                        } else {
                            dateiNameIstGültig = true;
                            File file = new File(fileName + ".txt");
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                mv.zeigeMedien(fileOutputStream);
                                System.out.println("Dateien wurden in Liste geschrieben");
                                System.out.println();
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    } while (!dateiNameIstGültig);
                    break;
                case 5:
                    mv.speichern();
                    System.out.println();
                    break;
                case 6:
                    mv.laden();
                    break;
                case 7:
                    System.out.print("Neues Medium: ");
                    mv.suchNeuesMedium();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Durchschnittliches Erscheinungsjahr: " + mv.berechneErscheinungJahr() + "\n");
                    break;
                case 9:
                    System.out.println("Okay, Tschüss");
                    break;
                default:
                    System.out.println("Bitte zwischen 1 und 6 auswählen");
            }
        }

    }

    private void addAudio() {
        String titel;
        boolean isTitleValid = false;
        do {
            titel = JOptionPane.showInputDialog(null, "Title");
            if (titel == null) {
                return;
            }
            if (titel != null && titel.length() == 0) {
                JOptionPane.showMessageDialog(null, "Title darf nicht leer sein!\nBitte erneut eingeben");
            } else {
                isTitleValid = true;
            }

        } while (isTitleValid == false);


        boolean isJahrValid = false;
        int jahr = 0;
        do {
            try {
                jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));
                isJahrValid = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Bitte gültiges Erscheinungsjahr eingeben");
            }
        } while (isJahrValid == false);


        String interpret;
        boolean isInterpretValid = false;
        do {
            interpret = JOptionPane.showInputDialog(null, "Interpret");
            if (interpret == null) {
                return;
            }
            if (interpret != null && interpret.length() == 0) {
                JOptionPane.showMessageDialog(null, "Interpret darf nicht leer sein!\nBitte erneut eingeben");
            } else {
                isInterpretValid = true;
            }

        } while (isInterpretValid == false);


        int dauer = 0;
        boolean isDauerValid = false;
        do {
            try {
                dauer = Integer.parseInt(JOptionPane.showInputDialog(null, "Dauer"));
                isDauerValid = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Bitte gültige Dauer eingeben");
            }
        } while (isDauerValid == false);

        Audio a = new Audio(titel, jahr, interpret, dauer);

        mv.aufnehmen(a);
        JOptionPane.showMessageDialog(null, "Audio wurde erfolgreich hinzugefügt");
    }

    private void addBild() {
        String titel = JOptionPane.showInputDialog(null, "Title");
        int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));
        String ort = JOptionPane.showInputDialog(null, "Ort");

        Bild b = new Bild(titel, jahr, ort);

        mv.aufnehmen(b);
        JOptionPane.showMessageDialog(null, "Bild wurde erfolgreich hinzugefügt");
    }
}
