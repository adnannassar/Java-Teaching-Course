package AdvancedKurs;

import java.util.Iterator;
import java.util.LinkedList;

public class MedienverwaltungNichtTypsicher {
    LinkedList medien;

    public MedienverwaltungNichtTypsicher() {
        medien = new LinkedList();
    }

    public void aufnehmen(Medium m) {
        medien.add(m);
    }

    public void zeigeMedien() {
        Iterator it = medien.iterator();
        while(it.hasNext()){
            ((Medium)it.next()).druckeDaten(System.out);
        }
    }

    public void suchNeuesMedium() {
        Medium minMedium = (Medium) medien.get(0);
        for(Object obj: medien){
            if(((Medium)obj).alter() < minMedium.alter()){
                minMedium = (Medium)obj;
            }
        }
        minMedium.druckeDaten(System.out);
    }

    public double berechneErscheinungJahr() {
        double summe = 0.0;
        Iterator it = medien.iterator();
        while(it.hasNext()){
            summe += ((Medium) it.next()).getJahr();
        }
        return summe / medien.size();
    }
}
