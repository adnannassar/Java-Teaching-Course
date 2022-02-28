package Lesson_05_Zussamenfassung.Fussballmanschaft;

public abstract class Mitglied {
    private static int counter = 0;
    private int id;
    private String vorname;
    private String nachname;
    private char type;


    public Mitglied(String vorname, String nachname, char type) {
        this.id = counter;
        this.counter++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.type = type;

    }
    public int getId() {
        return id;
    }


    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public abstract double berechneGehalt();

    public abstract String getSonstiges();

    @Override
    public String toString() {
        return type + " " + vorname + " " + nachname;
    }


}
