package AdvancedKurs;

import javax.swing.*;

public class MainTypsicher {
    public static void main(String[] args) {
        Audio a1 = new Audio("It Means Nothing", 2007, "Stereophonics", 229);
        Audio a2 = new Audio("Girls like you", 2018, "Max", 400);

        Bild b1 = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Bild b2 = new Bild("Sunset", 2017, "Bochum");


        MedienverwaltungTypsicher mv = new MedienverwaltungTypsicher();

        /*
        mv.aufnehmen(a1);
        mv.aufnehmen(a2);
        mv.aufnehmen(b1);
        mv.aufnehmen(b2);
         */

        Menu menu = new Menu(mv);

        menu.showMenu();

    }
}
