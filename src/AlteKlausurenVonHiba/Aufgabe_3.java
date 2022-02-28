package AlteKlausurenVonHiba;

public class Aufgabe_3 {
    public static void main(String[] args) {
        int array[] = {10, -8, -5, 6, -2, 8, 0, -1, -10};
        System.out.print("Original: ");
        printArray(array);
        int filteredArray[] = filter(array, -6); // {10,6,7,8,20}
        System.out.print("Filtered: ");
        printArray(filteredArray);
    }

    public static int[] filter(int[] input, int n) {
        if (input != null && input.length > 0) {
            int counter = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] >= n) {
                    counter++;
                }
            }
            int[] result = new int[counter];
            int c = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] >= n) {
                    result[c] = input[i];
                    c++;
                }
            }
            return result;

        } else {
            return null;
        }
    }

    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
