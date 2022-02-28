package Lesson_05_Zussamenfassung.Fussballmanschaft;

import java.util.Scanner;

public class Menu {

    private Mannschaftsverwaltung mv;
    private Scanner sc;

    public Menu(Mannschaftsverwaltung mv) {
        this.mv = mv;
        sc = new Scanner(System.in);
    }

    public void showMenu() {
        int einagbe;
        do {
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println(mv);
            System.out.println("Weitere Aktionen:\n"
                    + "1.Arzt hinzufugen\n"
                    + "2.Spieler hinzufugen\n"
                    + "3.Trainer hinzufugen\n"
                    + "4.Beenden");
            System.out.print("Ihre Eingabe: ");
            einagbe = sc.nextInt();
            switch (einagbe) {
                case 1:
                    addArzt();
                    break;
                case 2:
                  addSpieler();
                    break;
                case 3:
                    addTrainer();
                    break;
                case 4:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Bitte etwas gultiges eingeben");
            }
        } while (einagbe != 4);
    }

    private void addArzt() {
        System.out.print("Bitte Name des Arzts eingeben: ");
        String name = sc.next();
        System.out.print("Bitte Nachname des Arzts eingeben: ");
        String nachname = sc.next();
        System.out.print("Bitte Fachrictung des Arzts eingeben: ");
        String fachrictung = sc.next();

        Arzt arzt = new Arzt(name, nachname, fachrictung);
        mv.addMitglied(arzt);
    }
    private void addSpieler() {
        System.out.print("Bitte name des Spielers eingeben: ");
        String name = sc.next();
        System.out.print("Bitte Nachname des Spielers eingeben: ");
        String nachname = sc.next();
        System.out.print("Bitte Spielposition des Spielers eingeben: ");
        String spielposition = sc.next();
        System.out.print("Bitte Spielanstze des Spielers eingeben: ");
        int spielanstze = sc.nextInt();

        Spieler spieler = new Spieler(name, nachname, spielposition, spielanstze);
        mv.addMitglied(spieler);

    }
    private void addTrainer() {
        System.out.print("Bitte name des Trainers eingeben: ");
        String name = sc.next();
        System.out.print("Bitte Nachname des Trainers eingeben: ");
        String nachname = sc.next();

        System.out.print("Bitte des Lieblings Spieler aus der Liste auswählen: ");
        System.out.println(mv.getListOfSpielers());
        System.out.print("Ihre Eingabe: ");
        int option = sc.nextInt();
        Spieler lieblingsSpieler = mv.getSpilerByIndex(option);

        Trainer trainer = new Trainer(name, nachname, lieblingsSpieler);
        mv.addMitglied(trainer);
    }




}
