package AlteKlausurenVonHiba.aufgabe6;

public class Book {
    private String author;
    private String titel;

    public Book(String author, String titel) {
        this.author = author;
        this.titel = titel;
    }


    @Override
    public String toString() {
        return "Author: " + author+ ", Titel: " + titel;
    }
}
