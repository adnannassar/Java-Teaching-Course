package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public class SimpleFile implements Uploadable {
    private String dateiname;

    public SimpleFile(String dateiname) {
        this.dateiname = dateiname;
    }

    @Override
    public String getName() {
        return dateiname;
    }
}
