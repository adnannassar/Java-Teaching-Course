package AdvancedKurs.Observable;

import java.util.Observable;
import java.util.Observer;

public class FirmaExampleObservablesMusterJava {
    public static void main(String[] args) {
        Artikel iphone13 = new Artikel("Iphone 13", 1200);
        Artikel lg = new Artikel("lg z ultra", 300);

        Kunde hiba = new Kunde("Hiba");
        Kunde rawan = new Kunde("Rawan");


        iphone13.addObserver(hiba);
        iphone13.addObserver(rawan);


        lg.addObserver(rawan);


        lg.setPreis(100);

    }

  static class Artikel extends Observable {
        double preis;
        String name;

        public Artikel(String name, double preis ) {
            this.preis = preis;
            this.name = name;
        }

        public void setPreis(double newPreis) {
                if (newPreis < preis) {
                    String msg = "Preis von " + name + " wurde reduziert. Der neue Preis ist: " + newPreis;
                    this.setChanged();
                    this.notifyObservers(msg);
                }
                this.preis = newPreis;
        }
    }

  static class Kunde implements Observer {
        String name ;

        public Kunde(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object msg) {
            System.out.println(this.name + " wurde benachrichtigt, dass "+ msg);
        }
    }
}
