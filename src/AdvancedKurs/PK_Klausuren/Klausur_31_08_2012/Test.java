package AdvancedKurs.PK_Klausuren.Klausur_31_08_2012;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
        
        System.out.println("Before :");
        printList();
        
        
        File file = new File("TEST.abc");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));) {
            oos.writeObject(list);
        } catch (IOException ex) {
            System.out.println("IO Exception save");
        }
        
        list.clear();
        System.out.println("After Clear:");
        printList();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
            list = (ArrayList<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("IO Exception  &  ClassNotFoundException");
        }
        System.out.println("After Load");
        printList();
    }

    public static void printList() {
        if(list.isEmpty())
            System.out.println("Die Liste is leer");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
