package AdvancedKurs.Observable;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FirmaExample {
    public static void main(String[] args) {
        Firma firma = new Firma();
        firma.addArtikel(new Artikel("IPHONE 13", 1200));
        firma.addArtikel(new Artikel("Note 10", 700));

        firma.setPreis(0,1199);
        firma.setPreis(1,800);


    }
    static class Firma {
        List<Artikel> bestand;

        public Firma() {
            this.bestand = new LinkedList<>();
        }

        public void addArtikel(Artikel artikel) {
            this.bestand.add(artikel);
        }

        public void setPreis(int indexOfArtikel ,double newPreis){
            this.bestand.get(indexOfArtikel).setPreis(newPreis);
        }
    }

    static class Artikel {
        double preis;
        String name;

        public Artikel(String name, double preis ) {
            this.preis = preis;
            this.name = name;
        }

        public void setPreis(double newPreis) {
            if (newPreis < preis) {
                System.out.println("Preis von " + name + " wurde reduziert. Der neue Preis ist: " + newPreis);
            }
            this.preis = newPreis;
        }
    }

}
