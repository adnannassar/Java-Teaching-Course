package Lesson_02_Controls;

import java.util.Scanner;

public class Tagen_der_Monaten {
    public static void main(String[] args) {
        // tageDerMonat("März");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte ein Zahl eingeben:");
        int n = sc.nextInt();
        ubung3(n);


    }

    static void tageDerMonat(String monatName) {
        switch (monatName) {
            case "Januar", "März", "Juli", "Oktober",
                    "August", "October", "Dezember":
                System.out.println(31);
                break;

            case "Februar":
                System.out.println(28);
                break;

            case "April", "Juni", "September", "November":
                System.out.println(30);
                break;

            default:
                System.out.println("Bitte eine gültige Eingabe tippen");
        }
    }

    static  void ubung3(int n){
        for (int i = n; i > 0; i -= 2) {
                System.out.print(i+ " ");
        }
        System.out.println();

        for(int i = 0 ; i<n; i++){
            System.out.print("-");
        }

        System.out.println();

        while (n>0){
            System.out.print(n + " ");
            n-=2;
        }
    }

}
