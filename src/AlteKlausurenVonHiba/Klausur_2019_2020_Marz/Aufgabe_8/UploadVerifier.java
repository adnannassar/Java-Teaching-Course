package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public interface UploadVerifier {
    /**
     * Prüft das übergebene Objekt und gibt true zurück, falls es gültig ist. * Andernfalls wird false zurückgegeben.
     */
    boolean isValid(Uploadable object);
}
