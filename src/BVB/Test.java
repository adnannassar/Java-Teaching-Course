package BVB;

public class Test {
    public static void main(String[] args) {

        Spieler mario = new Spieler("Mario", "Götze", "Mittelfeld", 5);
        Spieler pierreEmerik = new Spieler("Pierre-Emerik", "Aubameyang", "Sturm", 18);
        Trainer thomas = new Trainer("Thomas", "Tuchel", pierreEmerik);
        Arzt markus = new Arzt("Markus", "Braun", "Orthopädie");

        System.out.println("Before verwaltung:");
        System.out.println(mario);
        System.out.println(pierreEmerik);
        System.out.println(thomas);
        System.out.println(markus);

        System.out.println("\nAfter verwaltung:");
        Mannschaftsverwaltung mannschaftsverwaltung = new Mannschaftsverwaltung("BVB");
        mannschaftsverwaltung.addMitglied(mario);
        mannschaftsverwaltung.addMitglied(pierreEmerik);
        mannschaftsverwaltung.addMitglied(thomas);
        mannschaftsverwaltung.addMitglied(markus);

        mannschaftsverwaltung.infoAusgeben();



    }
}
