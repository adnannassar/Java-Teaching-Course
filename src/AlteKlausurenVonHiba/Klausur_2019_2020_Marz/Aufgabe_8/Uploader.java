package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public class Uploader {
    /**
     * Lädt ein hochladbares Objekt hoch. Gibt true zurück, falls das Objekt * hochgeladen werden konnte. Andernfalls wird false zurückgegeben.
     */
    public boolean upload(Uploadable uploadable) {
        return Website.upload(uploadable);
    }
}
