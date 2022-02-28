package AdvancedKurs;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

public class Audio extends Medium{
    private String interpret;
    private int dauer;
    private static final long serialVersionUID = 2l;
    public Audio (String titel, int jahr,String interpret, int dauer){
        super(titel, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    public int getDauer() {
        return dauer;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    @Override
    public void druckeDaten(OutputStream stream) {
        PrintWriter printWriter = new PrintWriter(stream);
        printWriter.printf("ID = %d \"%s\" von %s aus %d Spieldauer: %d sek.\n" , getId(), getTitel(), interpret, getJahr(), dauer);
        printWriter.flush();
    }


    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),interpret, dauer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (super.equals(o) == false) return false;
        Audio audio = (Audio) o;
        if(dauer == audio.dauer && interpret.equals(audio.interpret)){
            return true;
        }else{
            return false;
        }
    }
}
