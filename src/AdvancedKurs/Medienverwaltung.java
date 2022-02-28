package AdvancedKurs;

public class Medienverwaltung {
    private Medium medien[];

    public Medienverwaltung(int size) {
        this.medien = new Medium[size];
    }

    public void aufnehmen(Medium m) {
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] == null) {
                medien[i] = m;
                break;
            }
        }
    }

    public void zeigeMedien() {
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] != null) {
                medien[i].druckeDaten(System.out);
            }
        }
    }

    public void suchNeuesMedium() {
        int minAlter = medien[0].alter();
        int indexOfMinMedium = 0;
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] != null && medien[i].alter() < minAlter) {
                minAlter = medien[i].alter();
                indexOfMinMedium = i;
            }
        }
        medien[indexOfMinMedium].druckeDaten(System.out);
    }

    public double berechneErscheinungJahr() {
        double summe = 0.0;
        int count = 0;
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] != null) {
                summe += medien[i].getJahr();
                count++;
            }
        }
        return summe / count;
    }

}
