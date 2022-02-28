package Aufgabe3;

public class Telefon {
    private int id;
    private String rufnemmer;

    public Telefon(int id, String rufnemmer) {
        this.id = id;
        this.rufnemmer = rufnemmer;
    }

    public int getId(){
        return id;
    }

    public String getRufnemmer() {
        return rufnemmer;
    }

    @Override
    public String toString() {
        return "";
    }
}
