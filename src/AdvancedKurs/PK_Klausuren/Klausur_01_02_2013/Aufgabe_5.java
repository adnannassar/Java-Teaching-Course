package AdvancedKurs.PK_Klausuren.Klausur_01_02_2013;

public class Aufgabe_5 {

    public static void main(String[] args) {
        Bank b = new Bank();
        Angestellter Schulz = new Angestellter(b, 1, 2, 20);
        Angestellter Meier = new Angestellter(b, 2, 3, 20);
        Angestellter Mueller = new Angestellter(b, 3, 1, 20);

        Thread t1 = new Thread(Schulz);
        Thread t2 = new Thread(Meier);
        Thread t3 = new Thread(Mueller);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Bank {

    static int[] konten = {30, 50, 100};

    public void überweisen(int vonKonto, int nachKonto, int betrag) {
        int neuerBetrag;
        neuerBetrag = konten[vonKonto];
        neuerBetrag -= betrag; // Inkonsistenz, da neuer Betrag noch nicht vermerkt  
        try {
            Thread.sleep((int) Math.random() * 1000);
        } catch (InterruptedException e) {
        }
        konten[vonKonto] = neuerBetrag;
        neuerBetrag = konten[nachKonto];
        neuerBetrag += betrag;
        konten[nachKonto] = neuerBetrag;
    }

    public void kontostand() {
        for (int i = 0; i < konten.length; i++) {
            System.out.println("Konto " + i + ": " + konten[i]);
        }
    }
}

class Angestellter extends Thread {

    Bank eineBank;
    int vonKonto, nachKonto, betrag;

    public Angestellter(Bank eineBank, int vonKonto, int nachKonto, int betrag) {
        this.eineBank = eineBank;
        this.vonKonto = vonKonto;
        this.nachKonto = nachKonto;
        this.betrag = betrag;
    }

    public void run() { // Überweisung vornehmen 
        eineBank.überweisen(vonKonto, nachKonto, betrag); // Kontostand ausgeben 
        System.out.println("Nachher:");
        eineBank.kontostand();
    }
}
