package AdvancedKurs;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium>, Serializable{
    private int id;
    private static int counter = 0;
    private String titel;
    private int jahr;
    private static final long serialVersionUID = 1l;

    public Medium(){
        id = counter;
        counter++;
    }

    public Medium(String titel, int jahr) {
        id = counter;
        counter++;
        this.titel = titel;
        this.jahr = jahr;
    }

    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public int getJahr() {
        return jahr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int alter() {
        return LocalDate.now().getYear()- jahr;
    }

    public abstract void druckeDaten(OutputStream stream);

    @Override
    public int hashCode(){
       return  Objects.hash(titel, jahr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Medium m = (Medium) o;
        if(this.jahr ==  m.jahr && this.titel.equals(m.titel)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int compareTo(Medium m){
        return this.jahr - m.jahr;
    }

    @Override
    public String toString() {
        return "ID = " + id + " \"" +titel+"\" ";
    }
}
