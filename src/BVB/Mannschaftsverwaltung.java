package BVB;

public class Mannschaftsverwaltung {
    private String name;
    private Mitglied[] mitglieder;

    public Mannschaftsverwaltung(String name) {
        this.name = name;
        mitglieder = new Mitglied[30]; // {null, null, null.....}
    }

    public void addMitglied(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                break;
            }
        }
    }

    public void infoAusgeben(){
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                System.out.println(mitglieder[i]);
            }
        }
    }
}
