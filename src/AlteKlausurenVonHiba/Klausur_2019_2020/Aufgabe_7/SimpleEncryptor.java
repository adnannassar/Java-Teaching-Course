package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_7;

public class SimpleEncryptor implements Encryptor {
    private byte schlüssel;

    public SimpleEncryptor(byte schlüssel) {
        this.schlüssel = schlüssel;
    }

    @Override
    public void encrypt(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += schlüssel;
        }
    }
}
