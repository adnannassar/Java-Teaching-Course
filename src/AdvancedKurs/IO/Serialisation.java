package AdvancedKurs.IO;

import AdvancedKurs.Audio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Serialisation {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        System.out.println("Before: " + names);
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("names.ser"));
            names = (LinkedList<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After: " + names);
    }


}
