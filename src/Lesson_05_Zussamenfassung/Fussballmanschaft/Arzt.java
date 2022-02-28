package Lesson_05_Zussamenfassung.Fussballmanschaft;

public class Arzt extends Mitglied {
    private String fachrichtung;

    public Arzt(String vorname, String nachname, String fachrichtung) {
        super(vorname, nachname, 'A');
        this.fachrichtung = fachrichtung;

    }
    // read
    public String getFachrichtung() {
        return fachrichtung;
    }
    // write
    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    @Override
    public double berechneGehalt() {
        return 10.000 * 12;
    }

    @Override
    public String getSonstiges() {
        return "Fachrichtung: " + fachrichtung;
    }
}
