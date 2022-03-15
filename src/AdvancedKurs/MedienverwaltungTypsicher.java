package AdvancedKurs;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

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

        medien.stream().min(Comparator.comparingInt(Medium::alter)).get().druckeDaten(System.out);

    }

    public double berechneErscheinungJahr() {

        double summe = 0.0;
        Iterator<Medium> it = medien.iterator();
        while (it.hasNext()) {
            summe += it.next().getJahr();
        }
        int  i = medien.stream().map(Medium::getJahr).reduce(0, Integer::sum) / medien.size();

        return (double) i;

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
            Object tempObject = objectInputStream.readObject();
            if(tempObject != null){
                medien = (LinkedList<Medium>)tempObject;
                System.out.println("List wurde geladen!");
            }else{
                System.out.println("Etwsa ist schief gelaufen!");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
