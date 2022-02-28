package BVB;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpiler;

    public Trainer(String vorname, String name, Spieler lieblingsSpiler) {
        super(vorname, name);
        this.lieblingsSpiler = lieblingsSpiler;
    }

    public void setLieblingsSpiler(Spieler lieblingsSpiler) {
        this.lieblingsSpiler = lieblingsSpiler;
    }

    public Spieler getLieblingsSpiler() {
        return lieblingsSpiler;
    }
    @Override
    public double berechneJahresGehalt() {
        return 165.000 * 12;
    }

    @Override
    public String toString() {
        return super.toString() +" Trainer{" +
                "lieblingsSpiler=" + lieblingsSpiler +
                '}';
    }
}

