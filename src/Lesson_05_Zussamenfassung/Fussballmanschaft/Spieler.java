package Lesson_05_Zussamenfassung.Fussballmanschaft;

public class Spieler extends Mitglied{
    private String spielPosition;
    private int spielansatze;

    public Spieler(String vorname, String nachname,String spielPosition, int spielansatze) {
     super(vorname, nachname, 'S');
     this.spielPosition = spielPosition;
     this.spielansatze = spielansatze;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public int getSpielansatze() {
        return spielansatze;
    }

    public void setSpielansatze(int spielansatze) {
        this.spielansatze = spielansatze;
    }

    @Override
    public double berechneGehalt() {
        return (180.000 * 12) + (5000.0 * spielansatze);
    }

    @Override
    public String getSonstiges() {
        return  "Position: " + spielPosition +" / Spielansatze : " +spielansatze;
    }

    @Override
    public String toString() {
        return super.toString() + " "+ spielPosition +" " + spielansatze;
    }
}
