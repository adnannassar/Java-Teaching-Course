package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_7;

public class Main {
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        originalList.add(1);
        originalList.add(6);
        originalList.add(2);
        originalList.add(3);
        originalList.add(7);

        LinkedList oddList = originalList.filterOddNumbers();

        originalList.printList();
        oddList.printList();

        int array [] = {1,2,7};

        System.out.println(originalList.containsAll(array));


    }
}
