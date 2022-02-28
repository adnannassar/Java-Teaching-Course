package Lesson_02_Controls;

import java.util.Scanner;

public class Dose {

    static double radius, hohe;

    public static void main(String[] args) {
        berechneDose();
    }

    static double umfang() {
        return 2 * Math.PI * radius;
    }

    static double deckelFlache() {
        return Math.PI * Math.pow(radius, 2);
    }

    static double mantelFlache() {
        return umfang() * hohe;
    }

    static double oberflache() {
        return (2 * deckelFlache()) + mantelFlache();
    }

    static double volumen() {
        return deckelFlache() * hohe;
    }

    static void berechneDose() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Bitte radius eingeben:");
        radius = myScanner.nextDouble();

        System.out.println("Bitte radius eingeben:");
        hohe = myScanner.nextDouble();

        System.out.println("Umfang: " + umfang());
        System.out.println("deckelFlache: " + deckelFlache());
        System.out.println("mantelFlache: " + mantelFlache());
        System.out.println("oberflache: " + oberflache());
        System.out.println("volumen: " + volumen());
    }
}
