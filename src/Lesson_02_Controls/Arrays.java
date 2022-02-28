package Lesson_02_Controls;

public class Arrays {

    public static void main(String[] args) {
        char[][] array = new char[5][5];

        fillArray(array);
        printArray(array);

    }


    static void fillArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array.length/ 2) {
                    array[i][j] = '*';
                }
            }
        }
    }

    static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        return min;
    }







}


