/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedKurs.PK_Klausuren.Klausur_31_08_2012;

public class Aufgabe_4 {

    public static void main(String[] args) {
        try{
        berechnung();
        }catch(NumberFormatException ex){
            System.out.println("Falche Umwandlung");
        }finally{
            System.out.println("Aufwiedersehen ! ");
        } 
    }

    public static void berechnung() throws NumberFormatException {
        int i = 0;
        int base = 0;
        for (base = 10; base >= 2; --base) {
            i = Integer.parseInt("40", base);
            System.out.println("40 " + "base" + base + "=" + i);
        }
    }
}
