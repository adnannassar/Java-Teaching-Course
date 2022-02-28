
package AdvancedKurs.PK_Klausuren.Klausur_31_08_2012;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;


public class Aufgabe_5 {

    static ArrayList<Fahrzeug> list = new ArrayList();

    public static void main(String[] args) {
        Fahrzeug firmenWagen;
        firmenWagen = new Fahrzeug("2010", "schwarz", Fahrzeug.plakettenTyp.Gruen);
        Fahrzeug privatWagen;
        privatWagen = new Fahrzeug("2001", "rot", Fahrzeug.plakettenTyp.Gelb);
        privatWagen.addAnbauteil(new Anbauteil("Neue Stabilisatoren"));
        privatWagen.addAnbauteil(new Anbauteil("Sportsitze"));
        
        // elemente in liste hinfügen
        list.add(privatWagen);
        list.add(firmenWagen);
        
        // printing
        System.out.print("Before : ");
        print();
     
        // speichern
        File f = new File("meineFahrzeuge.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));) 
             {
                 oos.writeObject(list);
           
        } catch (IOException ex) {
            System.out.println("\nIOException");
        }
        
        
        //firmenWagen = privatWagen = null;
        list.clear();
        
        System.out.print("After Clear : ");
        print();
        
        // laden
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));) 
            {
            list = (ArrayList<Fahrzeug>) ois.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Multi Exception");
        }
        System.out.println("After Loading : ");
        print();

    }

    public static void print() {
        if (list.isEmpty()) {
            System.out.println("Die Liste is Empty");
        }
        Iterator<Fahrzeug> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().getFarbe()+"\t");
        }
    }

}

class Fahrzeug implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum plakettenTyp {
        Gruen, Gelb, Rot
    }
    String farbe, baujahr;
    plakettenTyp plakette;
    ArrayList<Anbauteil> anbauteile = new ArrayList<Anbauteil>();

    public Fahrzeug(String baujahr, String farbe, plakettenTyp plakette) {
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.plakette = plakette;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(String baujahr) {
        this.baujahr = baujahr;
    }

    public plakettenTyp getPlakette() {
        return plakette;
    }

    public void setPlakette(plakettenTyp plakette) {
        this.plakette = plakette;
    }

    public void addAnbauteil(Anbauteil anbauteil) {
        this.anbauteile.add(anbauteil);
    }

    public Anbauteil getAnbauteilAtIndex(int i) {
        if (i > 0 && i < anbauteile.size()) {
            return anbauteile.get(i);
        } else {
            return null;
        }
    }

    public int getAnzahlVonAnbauteilen() {
        return anbauteile.size();
    }
}

class Anbauteil implements Serializable{
    String name;

    public Anbauteil(String name) {
        this.name = name;
    }

}
