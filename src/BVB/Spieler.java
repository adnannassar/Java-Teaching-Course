package BVB;

public class Spieler extends Mitglied {
    private String spielposition;
    private int spieleinsätze;
    public Spieler(String vorname, String name,String spielposition,int spieleinsätze ) {
           super(vorname, name);
           this.spielposition = spielposition;
           this.spieleinsätze = spieleinsätze;
    }

    public int getSpieleinsätze() {
        return spieleinsätze;
    }

    public void setSpieleinsätze(int spieleinsätze) {
        this.spieleinsätze = spieleinsätze;
    }

    public String getSpielposition() {
        return spielposition;
    }

    public void setSpielposition(String spielposition) {
        this.spielposition = spielposition;
    }

    @Override
    public double berechneJahresGehalt() {
        return 180.000 * 12 + (5.000 * spieleinsätze);
    }

    @Override
    public String toString() {
        return  super.toString() +
                 " Spieler{" +
                "spielposition='" + spielposition + '\'' +
                ", spieleinsätze=" + spieleinsätze +
                '}';
    }
}
