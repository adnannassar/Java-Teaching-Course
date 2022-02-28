package Lesson_05_Zussamenfassung.Fussballmanschaft;

import java.util.ArrayList;

public class Mannschaftsverwaltung {
    private String name;
    private Mitglied[] mitglieder;
    private ArrayList<Spieler> spielers;

    public Mannschaftsverwaltung(String name) {
        this.name = name;
        mitglieder = new Mitglied[30];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMitglieder() {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                System.out.println(mitglieder[i]);
            }
        }
    }

    public void printMitgliederAlsTabelle() {
        System.out.println("Manschaft: " + name + "\n");
        System.out.printf("%-5s %-20s %-20s %-20s %-20s", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");

        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                System.out.printf("\n%-5s %-20s %-20s %-20s %-20s", mitglieder[i].getType(), mitglieder[i].getVorname(), mitglieder[i].getNachname(), mitglieder[i].berechneGehalt(), mitglieder[i].getSonstiges());
            }
        }
        System.out.println("\n\nSumme der Jahersgehalter: \t\t\t\t\t\t" + berechneGehalterSumme() + ".");
        System.out.println();
    }


    private double berechneGehalterSumme() {
        double summeGehlater = 0;
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                summeGehlater += mitglieder[i].berechneGehalt();
            }
        }
        return summeGehlater;
    }

    public void addMitglied(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += "Manschaft: " + name + "\n";
        result += String.format("%-5s %-5s %-20s %-20s %-20s %-20s", "ID", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");

        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                result += String.format("\n%-5d %-5s %-20s %-20s %-20s %-20s",mitglieder[i].getId(), mitglieder[i].getType(), mitglieder[i].getVorname(), mitglieder[i].getNachname(), mitglieder[i].berechneGehalt(), mitglieder[i].getSonstiges());
            }
        }
        result += "\n\nSumme der Jahersgehalter: \t\t\t\t\t\t" + berechneGehalterSumme() + ".\n";
        return result;
    }

    public String getListOfSpielers() {
        spielers = new ArrayList<>();
        String result = "\n";
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].getType() == 'S') {
                result += (i + 1) + "." + mitglieder[i].getVorname() + " " + mitglieder[i].getNachname() + "\n";
                spielers.add((Spieler) mitglieder[i]);
            }
        }

        return result;
    }

    public Spieler getSpilerByIndex(int index) {
        if (spielers.get(index-1) != null) {
            return spielers.get(index - 1);
        } else {
            return null;
        }
    }
}
