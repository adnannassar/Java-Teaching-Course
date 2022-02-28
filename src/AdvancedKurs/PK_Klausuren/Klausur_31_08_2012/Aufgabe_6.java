package AdvancedKurs.PK_Klausuren.Klausur_31_08_2012;


public class Aufgabe_6 {
    public static void main(String[] args) {
        GeometrischeFigur kreis = new kreis(0, 0, 10);
        GeometrischeFigur rechEcke = new rechtEcke(10,10);
        
        System.out.println("Kreis Fläche  =  " +kreis.Flaeche());
        System.out.println("RechtEcke Fläche  =  " +rechEcke.Flaeche());
        
        System.out.println(kreis.Vergleiche(rechEcke)) ;
        
    }

}

abstract class GeometrischeFigur {

    int x;
    int y;

    public GeometrischeFigur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double Flaeche();

    public int Vergleiche(GeometrischeFigur gf) {
        if (gf.Flaeche() > this.Flaeche()) {
            return -1;
        } else if (gf.Flaeche() == this.Flaeche()) {
            return 0;
        } else {
            return 1;
        }
    }
}

class kreis extends GeometrischeFigur {

    int radius;

    public kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;

    }

    @Override
    public double Flaeche() {
     return   Math.PI * Math.pow(radius, 2);
    }

}

class rechtEcke extends GeometrischeFigur {

    public rechtEcke(int x, int y) {
        super(x, y);
    }

    @Override
    public double Flaeche() {
        return x * x;
    }

}
