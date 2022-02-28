package Lesson_05_Zussamenfassung.Fussballmanschaft;

public class Main {
    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Mario", "Gotze", "Mittelfeld", 5 );
        Spieler spieler2 = new Spieler("Pierre-Emerik", "Aubameyang", "Sturm", 18);
        Trainer trainer = new Trainer("Tuchel", "Thomas",  spieler2);
        Arzt arzt = new Arzt("Markus", "Braun" , "Orthopädie");

        Mannschaftsverwaltung mv = new Mannschaftsverwaltung("Real Madrid");
        mv.addMitglied(spieler1);
        mv.addMitglied(spieler2);
        mv.addMitglied(trainer);
        mv.addMitglied(arzt);

        Menu m = new Menu(mv);
        m.showMenu();

    }
}
