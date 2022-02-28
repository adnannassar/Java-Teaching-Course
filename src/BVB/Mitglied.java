package BVB;

public abstract class Mitglied {
    private String vorname;
    private String name;

    public Mitglied(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public abstract double berechneJahresGehalt();

    @Override
    public String toString() {
        return "Mitglieder{" +
                "vorname='" + vorname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
