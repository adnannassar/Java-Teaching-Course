package AdvancedKurs;

public class MainNichtTypsicher {
    public static void main(String[] args) {
        Audio a1 = new Audio("It Means Nothing",2007,"Stereophonics", 229);
        Audio a2 = new Audio("Girls like you",2018,"Max", 400);

        Bild b1 = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Bild b2 = new Bild("Sunset", 2017, "Bochum");

        MedienverwaltungNichtTypsicher mv = new MedienverwaltungNichtTypsicher();
        mv.aufnehmen(a1);
        mv.aufnehmen(a2);
        mv.aufnehmen(b1);
        mv.aufnehmen(b2);

        mv.zeigeMedien();

        System.out.println("\nNeues Medium ist: ");
        mv.suchNeuesMedium();

        System.out.println("\nDeurchschnittliche Erscheinungsjahr: ");
        System.out.println(mv.berechneErscheinungJahr());

    }
}
