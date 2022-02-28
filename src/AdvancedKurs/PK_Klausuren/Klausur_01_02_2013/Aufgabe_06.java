package AdvancedKurs.PK_Klausuren.Klausur_01_02_2013;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aufgabe_06 {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Ausgabe.txt");
                PrintWriter pw = new PrintWriter(fw);) {
            Fahrzeug f1 = null;
            Fahrzeug f2 = null;
            Fahrzeug f3 = null;
            f1 = new Fahrzeug();

            gebeTypAus(f1);
            gebeTypeAusWithPW(f1, pw);
            f2 = new Boot();
            f1 = f2;
            gebeTypAus(f3);
            gebeTypeAusWithPW(f3, pw);
            f2 = new Auto();
            gebeTypAus(f2);
            gebeTypeAusWithPW(f2, pw);
            gebeTypAus(f1);
            gebeTypeAusWithPW(f1, pw);
            f3 = new Lastwagen();
            f1 = f3;
            f2 = f1;
            gebeTypAus(f1);
            gebeTypeAusWithPW(f1, pw);

        } catch (IOException ex) {

        }

    }

    public static void gebeTypAus(Fahrzeug f) {
        if (f instanceof Auto) {
            System.out.println("Typ: Auto");
        } else if (f instanceof Lastwagen) {
            System.out.println("Typ: Lastwagen");
        } else if (f instanceof Boot) {
            System.out.println("Typ: Boot");
        } else if (f instanceof Fahrzeug) {
            System.out.println("Typ: Fahrzeug");
        } else {
            System.out.println("Typ: unbekannt");
        }
    }

    public static void gebeTypeAusWithPW(Fahrzeug f, PrintWriter pw) {

        if (f instanceof Auto) {
            pw.println("Type Auto");

        } else if (f instanceof Lastwagen) {
            pw.println("Typ: Lastwagen");

        } else if (f instanceof Boot) {
            pw.println("Typ: Boot");

        } else if (f instanceof Fahrzeug) {
            pw.println("Typ: Fahrzeug");

        } else {
            pw.println("Typ: unbekannt");

        }

    }

}

class Fahrzeug {
}

class Auto extends Fahrzeug {
}

class Lastwagen extends Fahrzeug {
}

class Boot extends Fahrzeug {
}
