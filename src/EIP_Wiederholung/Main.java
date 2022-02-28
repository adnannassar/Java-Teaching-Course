package EIP_Wiederholung;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 20, 17, -5, 250, 30, -70, 100};
        int[] opposite = {100, -70, 30, 250, -5, 17, 20, 1};

        printArray(array);
        System.out.println("The minimum of array: " + min(array));
        System.out.println("The maximum of array: " + max(array));

        int number = 1;
        System.out.println("Search for " + number + ": " + search(array, number));

        System.out.println("Search for 40: " + search(array, 40));
        System.out.println("Search for 100: " + search(array, 100));
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("}");
    }

    public static int min(int[] x) {
        int minimum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minimum) {
                minimum = x[i];
            }
        }
        return minimum;
    }

    public static int max(int[] x) {
        int maximum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maximum) {
                maximum = x[i];
            }
        }
        return maximum;
    }

    public static boolean search(int array[], int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

}
