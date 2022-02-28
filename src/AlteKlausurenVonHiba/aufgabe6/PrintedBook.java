package AlteKlausurenVonHiba.aufgabe6;

public class PrintedBook extends Book {
    private String format;

    public PrintedBook(String author, String titel, String format) {
        super(author, titel);
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format;
    }
}
