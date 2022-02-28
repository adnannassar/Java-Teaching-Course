package AdvancedKurs.Observable;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class FirmaExampleChangeListener {
    public static void main(String[] args) {
        Artikel iphone13 = new Artikel("IPhone 13" , 1200);

        iphone13.addListener(new Kunde("Baraa"));
        iphone13.addListener(new Kunde("Hiba"));
        iphone13.addListener(new Kunde("Rawan"));

        iphone13.setPreis(1100);
    }

    static class Artikel {
        public static String name;
        private DoubleProperty preis;

        public Artikel(String name, double preis) {
            this.name = name;
            this.preis = new SimpleDoubleProperty(preis);
        }

        public double getPreis() {
            return this.preis.get();
        }

        public void setPreis(double newPreis) {
            if(newPreis < getPreis()){
                this.preis.set(newPreis);
            }
        }

        public void addListener(ChangeListener listener) {
            this.preis.addListener(listener);
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    static class Kunde implements ChangeListener {
        String name ;

        public Kunde(String name) {
            this.name = name;
        }

        @Override
        public void changed(ObservableValue observable, Object oldValue, Object newValue) {
            System.out.println(this.name + " wurde benachrichtigt, dass der Preis von "
                    +Artikel.name+" reduziert wurde.\nAlte Preis: "+ oldValue + "\nNeue Preis: "+ newValue+"\n");
        }
    }
}
