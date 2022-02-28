package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public class JavaFileVerifier implements UploadVerifier {


    @Override
    public boolean isValid(Uploadable object) {
        if (object.getName().endsWith(".java")) {
            return true;
        } else {
            return false;
        }
    }
}
