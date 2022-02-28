package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_7;


public class MessageApp {
    public static void main(String[] args) {
        byte schlüssel = 2;
        String nachricht = "Hiba";

        Message message = new StringMessage(nachricht);
        Encryptor encryptor = new SimpleEncryptor(schlüssel);

        Connection secure = new SecureConnection(encryptor);
        byte[] msg = secure.convert(message);
        for (int i = 0; i < msg.length; i++) {
            System.out.print(msg[i]);
        }
        System.out.println();
    }
}
