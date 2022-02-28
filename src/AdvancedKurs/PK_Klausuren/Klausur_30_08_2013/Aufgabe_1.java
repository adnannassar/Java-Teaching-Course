package AdvancedKurs.PK_Klausuren.Klausur_30_08_2013;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe_1 {

    public static void main(String[] args) {
        LinkedList<Angestellter> list = new LinkedList();
        list.add(new Angestellter("adnan", 2500.0));
        list.add(new Angestellter("yasin", 3500.0));
        list.add(new Angestellter("hakan", 4500.0));
        list.add(new Angestellter("hamod", 5500.0));
        list.add(new Angestellter("nassar", 6500.0));
        list.add(new Angestellter("akkad", 216500.0));
        list.add(new Angestellter("tayser", 72500.0));
        System.out.println("Aufgabe 1.a");
        ausgabePersonal(list);
        System.out.println(".................................");
        System.out.println("Optemeiert");
        ausgabePersonal(list);
        System.out.println("**********************************");
        System.out.println("Aufgabe 1.b");
        Bungalow b1 = new Bungalow(50, 2);
        Bungalow b2 = new Bungalow(24, 1);
        Bungalow b3 = new Bungalow(200, 6);
        Bungalow b4 = new Bungalow(100, 3);
        LinkedList<Haus> hausListe = new LinkedList<Haus>();
        hausListe.add(b1);
        hausListe.add(b2);
        hausListe.add(b3);
        hausListe.add(b4);
        System.out.println("Before sorting");
        Iterator<Haus> it2 = hausListe.iterator();
        while (it2.hasNext()) {
            it2.next().druckeDaten();
        }

        Collections.sort(hausListe);
        System.out.println("After sorting");
        Iterator<Haus> it3 = hausListe.iterator();
        while (it3.hasNext()) {
            it3.next().druckeDaten();
        }

    }

    // nicht optemeiert
    public static void ausgabePersonal(LinkedList liste) {
        for (int i = 0; i < liste.size(); i++) {
            Angestellter a = (Angestellter) liste.get(i);
            System.out.printf("%-25s %5.2f%n", a.getName(), a.getGehalt());
        }
    }

    //optemeiert
    public static void ausgabePersonal(List list) {
        Iterator<Angestellter> it = list.iterator();
        while (it.hasNext()) {
            System.out.printf("%-25s %5.2f%n", it.next().getName(), it.next().getGehalt());

        }
    }
}

class Angestellter {

    private String name;
    private double gehalt;

    public Angestellter(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

}

abstract class Haus implements Comparable<Haus> {

    double wGrosse;

    public Haus(double wGrosse) {
        this.wGrosse = wGrosse;
    }

    public abstract void druckeDaten();

    @Override
    public int compareTo(Haus h) {
        return (int) (this.wGrosse - h.wGrosse);

    }
}

class Bungalow extends Haus {

    int anZimmer;

    public Bungalow(double wGrosse, int anZimmer) {
        super(wGrosse);
        this.anZimmer = anZimmer;
    }

    @Override
    public void druckeDaten() {
        System.out.println("Haus Größe = " + super.wGrosse + " Anzahl Zimmer = " + this.anZimmer);
    }

}
