package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_7;

public class SecureConnection extends Connection {
    private Encryptor encryptor;

    public SecureConnection(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    @Override
    protected byte[] convert(Message message) {
        byte[] msg = message.getContent();
        encryptor.encrypt(msg);
        return msg;
    }
}
