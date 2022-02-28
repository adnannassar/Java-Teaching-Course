package AlteKlausurenVonHiba.aufgabe6;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        ElectronicBook electronicBook = new ElectronicBook("Haydar", "Java for Profis", 50);
        PrintedBook printedBook = new PrintedBook("Baraa", "C++ from Zero to Hero", "A4");

        Book[] books = {electronicBook, printedBook};

        printAll(books);

    }

    public static void printAll(Book[] books) {
        System.out.println("Erweiterte For Schleife");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("----------------------");

        System.out.println("Normale For Schleife");
        for (int i = 0 ; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

}
