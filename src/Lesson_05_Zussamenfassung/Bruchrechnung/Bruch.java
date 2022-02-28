package Lesson_05_Zussamenfassung.Bruchrechnung;

public class Bruch {
    private int zaehler;
    private int nenner;


    public Bruch(int zaehler) {
        this.zaehler = zaehler;
        nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void multipliziere(int n) {
        zaehler = zaehler * n;
    }

    public void multipliziere(Bruch b) {
        zaehler = zaehler * b.zaehler;
        nenner = nenner * b.nenner;
    }

    public Bruch dividiere(Bruch b) {
       return new Bruch(zaehler * b.nenner, nenner * b.zaehler);
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }
}
