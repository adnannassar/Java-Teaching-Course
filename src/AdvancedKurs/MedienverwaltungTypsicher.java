package AdvancedKurs;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MedienverwaltungTypsicher {
    public LinkedList<Medium> medien;

    public MedienverwaltungTypsicher() {
        medien = new LinkedList();
    }

    public void aufnehmen(Medium m) {
        medien.add(m);
    }

    public void zeigeMedien(OutputStream stream) {
        if (medien.isEmpty()) {
            System.out.println("Medien Liste ist leer!");
        }
        Iterator<Medium> it = medien.iterator();
        Collections.sort(medien);
        while (it.hasNext()) {
            it.next().druckeDaten(stream);
        }
    }

    public void suchNeuesMedium() {
        Collections.sort(medien);
        Medium minMedium = medien.get(0);
        for (Medium m : medien) {
            if (m.alter() < minMedium.alter()) {
                minMedium = m;
            }
        }
        minMedium.druckeDaten(System.out);
    }

    public double berechneErscheinungJahr() {

        double summe = 0.0;
        Iterator<Medium> it = medien.iterator();
        while (it.hasNext()) {
            summe += it.next().getJahr();
        }
        return summe / medien.size();
    }

    // Try normal
    public void speichern() {
        try {
            File file = new File("saved_list.ser");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(medien);
            System.out.println("List wurde gespeichert!");
            fileOutputStream.close();
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Try with Resources
    public void laden() {
        File file = new File("saved_list.ser");
        try( FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            medien = (LinkedList<Medium>) objectInputStream.readObject();
            System.out.println("List wurde geladen!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
