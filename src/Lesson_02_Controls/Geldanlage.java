package Lesson_02_Controls;

import java.util.Scanner;

public class Geldanlage {
    static  Scanner sc = new Scanner(System.in);
    static  double anlagBetrag, laufZeit;

    public static void main(String[] args) {

        readAnlageBetragAndLaufZeit();
        int auwahll = 0 ;

        do {
            showMenu() ;
            auwahll  = sc.nextInt();
            handelUserInput(auwahll);
        }while (auwahll != 5);
    }


    static double berechneKapital(double verzinsung, double bonus, double anlageBetrag, double laufZeit) {
        return anlageBetrag * (1 + verzinsung / 100) + bonus;
    }
    static double vezinzungBerechnen(double anlageBetrag, float prozent) {
        return (anlageBetrag * 100) / prozent;

    }
    static void showMenu(){
        System.out.println("" +
                "--------------------------------------------\n" +
                "1- 1,5 % Verzinsung ohne Bonuszahlung\n" +
                "2- 0,7 % Verzinsung mit 15 Euro Bonuszahlung\n" +
                "3- 0,4 % Verzinsung mit 20 Euro Bonuszahlung\n" +
                "4- 0,1 % Verzinsung mit 50 Euro Bonuszahlung\n" +
                "5- Exit\n" +
                "--------------------------------------------");
        System.out.println("Bitte eine Option auswählen:");
    }
    static void handelUserInput(int option){
        switch (option) {
            case 1:
                System.out.println("Ihr Kapital für " + anlagBetrag + "€ in " + laufZeit + " Jahren = "
                        + berechneKapital(vezinzungBerechnen(anlagBetrag, 1.5f),
                        0, anlagBetrag, laufZeit));
                break;
            case 2:
                System.out.println("Ihr Kapital für " + anlagBetrag + "€ in " + laufZeit + " Jahren = "
                        + berechneKapital(vezinzungBerechnen(anlagBetrag, 0.7f),
                        15, anlagBetrag, laufZeit));
                break;
            case 3:
                System.out.println("Ihr Kapital für " + anlagBetrag + "€ in " + laufZeit + " Jahren = "
                        + berechneKapital(vezinzungBerechnen(anlagBetrag, 0.4f),
                        20, anlagBetrag, laufZeit));
                break;
            case 4:
                System.out.println("Ihr Kapital für " + anlagBetrag + "€ in " + laufZeit + " Jahren = "
                        + berechneKapital(vezinzungBerechnen(anlagBetrag, 0.1f),
                        50, anlagBetrag, laufZeit));
                break;
            case 5:
                System.out.println("Danke, aufwiedersehen ya 7bab");
                break;
            default:
                System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus.");
        }
    }
    static void readAnlageBetragAndLaufZeit(){
        System.out.println("Bitte den Anlagebetrag eingeben");
        anlagBetrag = sc.nextDouble();

        System.out.println("Bitte die Laufzeit eingeben");
        laufZeit = sc.nextInt();

    }
}
