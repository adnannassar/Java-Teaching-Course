package AdvancedKurs.PK_Klausuren.Klausur_26_01_2012;

import java.io.*;
import java.util.*;

public class Aufgabe_5 {

    public static void main(String[] args) {
        Person bart = new Person("Simpson", "Bart");
        Person homer = new Person("Simpson", "Homer");
        Person marge = new Person("Simpson", "Marge");
        bart.setMutter(marge);
        bart.setVater(homer);
        // serializieren
        File f = new File("FamilieSimpson.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));) {
            oos.writeObject(bart);
            oos.writeObject(homer);
            oos.writeObject(marge);
        } catch (IOException ex) {

        }
        bart=homer=marge = null;
        // desrializierung
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));){
            
        }catch(IOException ex){
            
        }
        
 
    }

   
    }


class Person implements Serializable {

    private String nachname, vorname;
    private Person vater, mutter;
    private ArrayList kind;

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
        kind = new ArrayList();
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setMutter(Person p) {
        mutter = p;
        p.addKind(this);
    }

    public Person getMutter() {
        return mutter;
    }

    public void setVater(Person p) {
        vater = p;
        p.addKind(this);
    }

    public Person getVater() {
        return vater;
    }

    private void addKind(Person p) {
        kind.add(p);
    }
}

