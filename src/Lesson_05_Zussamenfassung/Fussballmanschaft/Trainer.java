package Lesson_05_Zussamenfassung.Fussballmanschaft;

public class Trainer extends Mitglied {
    private Spieler lieblingSpieler;

    public Trainer(String vorname, String nachname,Spieler lieblingSpieler) {
        super(vorname, nachname, 'T');
        if( lieblingSpieler != null){
            this.lieblingSpieler = lieblingSpieler;
        }else{
            this.lieblingSpieler = new Spieler("", "", "", 0);
        }
    }


    public Spieler getLieblingSpieler() {
        return lieblingSpieler;
    }

    public void setLieblingSpieler(Spieler lieblingSpieler) {
        this.lieblingSpieler = lieblingSpieler;
    }

    @Override
    public double berechneGehalt() {
        return 165.000 * 12 ;
    }

    @Override
    public String getSonstiges() {
        return "Lieblingsspieler: " + lieblingSpieler.getVorname() + " " + lieblingSpieler.getNachname();
    }
}
