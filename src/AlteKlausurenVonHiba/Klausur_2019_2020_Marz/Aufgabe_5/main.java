package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_5;

public class main {
    public static void main(String[] args) {
        int array1[] = {1, 2, 8, 3, 8};
        int array2[] = {8, 8, 8};
        int array3[] = {};
        int n = 8;

        printArray(deleteNumOnlyOne(array1, n));
        printArray(deleteNumAll(array1, n));
        printArray(deleteNumAll(array2, n));
        printArray(deleteNumAll(array3, n));
    }

    public static int[] deleteNumOnlyOne(int arr[], int n) {
        int[] resultArray = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                resultArray = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    resultArray[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    resultArray[j] = arr[j + 1];
                }
                break;
            }
        }
        return resultArray;
    }

    public static int[] deleteNumAll(int arr[], int n) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                counter++;
            }
        }
        int resultArray[] = new int[arr.length - counter];

        for (int i = 0, j = 0; i < arr.length || j < resultArray.length; i++) {
            if (arr[i] != n) {
                resultArray[j++] = arr[i];
            }
        }


        return resultArray;
    }

    public static void printArray(int arr[]) {
        if(arr.length == 0 ){
            System.out.print("[]");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
