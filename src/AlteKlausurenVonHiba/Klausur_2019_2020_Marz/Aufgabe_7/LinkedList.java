package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_7;

public class LinkedList {
    private Node head = null;

    public void add(int n) {
        Node newNode = new Node(n, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node zeiger = head;
            while (zeiger.next != null) {
                zeiger = zeiger.next;
            }
            zeiger.next = newNode;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
        // return head == null;
    }

    public LinkedList filterOddNumbers() {
        LinkedList resultList = new LinkedList();
        Node zeiger = head;
        while (zeiger != null) {
            if (zeiger.element % 2 == 0) {
                resultList.add(zeiger.element);
            }
            zeiger = zeiger.next;
        }
        return resultList;
    }

    public void printList() {
        Node zeiger = head;
        while (zeiger != null) {
            System.out.print(zeiger.element + "\t");
            zeiger = zeiger.next;
        }
        System.out.println();
    }

    public boolean containsAll(int[] elements) {
        boolean erg = true;
        for (int i = 0; i < elements.length; i++) {
            Node zeiger = head;
            while (zeiger != null) {
                if (elements[i] != zeiger.element) {
                  erg = false;
                }else{
                    erg = true;
                }
                zeiger = zeiger.next;
            }
        }
        return erg;
    }
}
