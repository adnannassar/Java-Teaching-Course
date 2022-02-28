package AdvancedKurs.PK_Klausuren.Klausur_31_08_2021.Aufgabe_2;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Medium {
    private int id;
    private static int counter;
    private String title;
    private int jahr;

    public Medium(String title, int jahr) {
        this.id = counter++;
        this.title = title;
        this.jahr = jahr;
    }

    public int alter() {
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten();

    public void printSortedList(List<Medium> liste) {
        Collections.sort(liste, (o1, o2) -> o1.alter() - o2.alter());
        liste.forEach(medium -> medium.druckeDaten());
    }

}
