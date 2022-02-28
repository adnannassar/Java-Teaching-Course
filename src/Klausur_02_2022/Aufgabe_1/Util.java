package Klausur_02_2022.Aufgabe_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Util {

   static void writeToFile(Angestellter a, File f) throws DateiException {
       try {
          FileWriter fileWriter = new FileWriter(f);
          PrintWriter printWriter = new PrintWriter(fileWriter);
          printWriter.printf("Name: %s\nGehalt: %.2f", a.name, a.gehalt);
          fileWriter.close();
          printWriter.close();
       } catch (IOException e) {
         throw new DateiException();
       }
    }
}
