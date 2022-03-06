package AdvancedKurs;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

public class Bild extends Medium {
    private String ort;
    private static final long serialVersionUID = 3l;

    public Bild() {
    }

    public Bild(String titel, int jahr, String ort) {
        super(titel, jahr);
        this.ort = ort;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public void druckeDaten(OutputStream stream) {
        PrintWriter printWriter = new PrintWriter(stream);
        printWriter.printf("ID = %d \"%s\" aufgenommen im Jahr %d in %s\n", getId(), getTitel(), getJahr(), ort);
        printWriter.flush();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ort);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("same Reference");
            return true;
        }
        if (obj == null) {
            System.out.println("nbj is null");
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            System.out.println("not same class name");
            return false;
        }
        if (!super.equals(obj)) {
            System.out.println("not the same title and jahr from super");
            return false;
        }
        Bild b = (Bild) obj;
        if (this.ort.equals(b.ort)) {
            System.out.println("same ort");
            return true;
        } else {
            System.out.println("not same ort");
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "aufgenommen im Jahr " + getJahr() + " in " + ort;
    }
}
