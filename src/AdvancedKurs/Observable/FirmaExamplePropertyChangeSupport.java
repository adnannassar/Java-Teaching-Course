package AdvancedKurs.Observable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class FirmaExamplePropertyChangeSupport {
    public static void main(String[] args) {
        Artikel iphone13 = new Artikel("IPhone 13", 1200);

        iphone13.addListener(new Kunde("Baraa"));
        iphone13.addListener(new Kunde("Hiba"));
        iphone13.addListener(new Kunde("Rawan"));

        iphone13.setPreis(1150);


    }

    static class Artikel {
        private String name;
        private double preis;
        private PropertyChangeSupport changeSupport;


        public Artikel(String name, double preis) {
            this.preis = preis;
            this.name = name;
            changeSupport = new PropertyChangeSupport(this);
        }

        // register observer (listener)
        public void addListener(PropertyChangeListener listener){
            changeSupport.addPropertyChangeListener(listener);
        }

        // remove observer (listener)
        public void removeListener(PropertyChangeListener listener){
            changeSupport.removePropertyChangeListener(listener);
        }


        public void setPreis(double newPreis) {
            if (newPreis < preis) {
                changeSupport.firePropertyChange(name, preis, newPreis);
            }
            this.preis = newPreis;
        }
    }

    static class Kunde implements PropertyChangeListener {
        String name ;

        public Kunde(String name) {
            this.name = name;
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(this.name + " wurde benachrichtigt, dass der Preis von "
                    +evt.getPropertyName()+" reduziert wurde.\nAlte Preis: "+ evt.getOldValue() + "\nNeue Preis: "+ evt.getNewValue()+"\n");
        }
    }
}
