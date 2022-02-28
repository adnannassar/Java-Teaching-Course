package Aufgabe3;

public class Test {
    public static void main(String[] args) {
        Smartphone iphone=  new Smartphone(001,"012351978123", 6.4);
        iphone.addSMS(00100,"Hallo");
        iphone.addSMS(00101,"Wie geht's");
        iphone.addSMS(00102,"gut danke!");

        iphone.ausgabeSMS();


    }
}
