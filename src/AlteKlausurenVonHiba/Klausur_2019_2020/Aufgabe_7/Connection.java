package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_7;

public abstract class Connection {

    protected abstract byte[] convert(Message message);

    public final void send(Message message) {
        byte[] data = convert(message);
        // Network.send(data);
    }
}
