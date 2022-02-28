package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_7;

public class StringMessage implements Message {
    private String nachricht;

    public StringMessage(String nachricht) {
        this.nachricht = nachricht;
    }

    @Override
    public byte[] getContent() {
        return nachricht.getBytes();
    }

    public String getNachricht() {
        return nachricht;
    }
}
