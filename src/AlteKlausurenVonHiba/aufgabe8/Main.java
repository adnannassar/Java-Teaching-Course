package AlteKlausurenVonHiba.aufgabe8;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedListJavaKurs listJavaKurs = new LinkedListJavaKurs();
        listJavaKurs.add(1);
        listJavaKurs.add(2);
        listJavaKurs.add(3);
        listJavaKurs.add(3);
        listJavaKurs.add(3);
        listJavaKurs.add(10);
        listJavaKurs.add(4);

        System.out.println(listJavaKurs);
        System.out.println("Remove 2");
        listJavaKurs.remove(2);
        System.out.println(listJavaKurs);

        System.out.println("Remove Max");
        listJavaKurs.deleteMax();
        System.out.println(listJavaKurs);


        System.out.println("Is 3 exist ? --> " + listJavaKurs.search(3));

        System.out.println("3 is in List " + listJavaKurs.count(0) + " Times");

    }

}
