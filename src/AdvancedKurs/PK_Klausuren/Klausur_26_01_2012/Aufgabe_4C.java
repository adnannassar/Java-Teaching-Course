package AdvancedKurs.PK_Klausuren.Klausur_26_01_2012;

import java.io.*;
import java.sql.*;

public class Aufgabe_4C {

}

class ReadObjects {

    public static void main(String[] args) {
       
        try {
            FileOutputStream os = new FileOutputStream("test.ser");
            FileInputStream fs = new FileInputStream("test.ser");
            ObjectInputStream is = new ObjectInputStream(fs);
            System.out.println("" + is.readInt());
            System.out.println((String) is.readObject());
            Time time = (Time) is.readObject();
            System.out.println(time.toString());
            is.close();
        } catch (ClassNotFoundException e) {
            System.out.println("0");
            System.err.println(e.toString());
        } catch (IOException e) {
            System.out.println("1");
            System.err.println(e.toString());
        }
    }
}
