package Aufgabe3;

import java.time.LocalTime;

public class Smartphone extends Telefon implements Uhr {
    private double displayGrosse;

    private SMS[] messages;


    public Smartphone(int id, String rufnemmer, double displayGrosse) {
        super(id, rufnemmer);
        this.displayGrosse = displayGrosse;
        this.messages = new SMS[1000];
    }


    public double getDisplayGrosse() {
        return this.displayGrosse;
    }

    public int getAnzahlSMS() {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public int addSMS(int emfangerId, String text) {
        for (int i = 0; i < messages.length; i++) {
            if(messages[i] == null){
                SMS s = new SMS(emfangerId, text);
                messages[i] = s;
                return i;
            }
        }
        return -1;
    }

    public void ausgabeSMS() {
        for(int i =  0 ; i<messages.length; i++){
            if(messages[i] != null){
                System.out.println("EmpfangerId: "+ messages[i].getEmpfangerId()
                        + ", Text: " + messages[i].getText());
            }
        }
    }

    @Override
    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }

    @Override
    public String toString() {
        return getId() + " " + getRufnemmer() + " " + displayGrosse;
    }


}
