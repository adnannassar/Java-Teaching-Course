package AlteKlausurenVonHiba.aufgabe8;


public class LinkedListJavaKurs {


    private Link head;

    void add(int value) {
        Link newLink = new Link(value, null);
        if (isEmpty()) {
            head = newLink;
        } else {
            Link pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newLink;
        }
    }

    boolean search(int value) {
        Link pointer = head;
        while (pointer != null) {
            if (pointer.value == value) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    int count(int value) {
        int counter = 0;
        Link pointer = head;
        while (pointer != null) {
            if (pointer.value == value) {
                counter++;
            }
            pointer = pointer.next;
        }
        return counter;
    }

    void remove(int value) {
        if (!isEmpty()) {
            Link pointer = head;
            Link beforePointer = null;
            while (pointer != null) {
                if (pointer.value == value) {
                    if (beforePointer == null) {
                        head = head.next;
                        break;
                    } else {
                        beforePointer.next = pointer.next;
                        break;
                    }
                } else {
                    beforePointer = pointer;
                    pointer = pointer.next;
                }
            }
        }
    }

    void deleteMax() {
        if (!isEmpty()) {
            int max = head.value;
            Link pointer = head;
            while (pointer != null) {
                if(pointer.value > max){
                    max = pointer.value;
                }
                pointer = pointer.next;
            }
            Link pointerForDelete = head;
            Link beforePointer = null;
            while (pointerForDelete != null) {
                if (pointerForDelete.value == max) {
                    if (beforePointer == null) {
                        head = head.next;
                        break;
                    } else {
                        beforePointer.next = pointerForDelete.next;
                        break;
                    }
                } else {
                    beforePointer = pointerForDelete;
                    pointerForDelete = pointerForDelete.next;
                }
            }
        }
    }

    @Override
    public String toString() {
        String output = "[";
        Link pointer = head;
        while (pointer.next != null) {
            output += pointer.value + ", ";
            pointer = pointer.next;
        }
        output += pointer.value + "]";
        return output;
    }


}
