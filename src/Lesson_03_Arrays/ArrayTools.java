package Lesson_03_Arrays;

import java.util.Scanner;

public class ArrayTools {

    public static void main(String[] args) {
        int value = 10;
        int array[] = {1, 2, 3, 5, 1, 1, 2};
        System.out.println("CheckNumber: " + checkNumbers(array));
        System.out.println("count: " + count(array, value));
        System.out.println("Aufgabe 3:");
        aufgabeC();


        System.out.println(".................");
        System.out.println("Aufgeb 4:");

        char charArray[][] = {
                {'*', 'a', '*'},
                {'*', '*', '*'},
                {'b', 'c', '0'}
        };

        berechneSterneProZeile(charArray);

        System.out.println(".................");
        System.out.println("Aufgeb Transpose:");

        int matrix[][] = {
                {1, 5, 7},
                {10, -2, 0},
                {3, 4, 6}
        };

        // -->            {1, 5, 7},
        //                {10, -2, 0},
        //                {3, 4, 6}
        System.out.println("Matrix Before");
        printArray2D(matrix);

        matrix = transposeMatrix(matrix);

        System.out.println("Matrix After");
        printArray2D(matrix);

        System.out.println("........................");
        System.out.println("Searching in Array (1D)");
        int array2[] = {1, 2, 3, 5, 1, 1, 2};
        System.out.println("Array");
        printArray1D(array2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte genen Sie einen Wert: ");
        int number = sc.nextInt();
        System.out.println("Searched for " + number + " --> " + findNumberInArray(array, number));


        System.out.println("........................");
        System.out.println("Searching in Array (2D)");
        int array2D[][] = {
                {1, 5, 7},
                {10, -2, 0},
                {3, 4, 6}
        };
        System.out.println("Array 2D");
        printArray2D(array2D);
        System.out.print("Bitte genen Sie einen Wert: ");
        int number2 = sc.nextInt();
        System.out.println("Searched for " + number2 + " --> " + findNumberIn2DArray(array2D, number2));



        System.out.println("........................");
        System.out.println("Searching in Array (1D)");
        int array3[] = {1, 2, 3, 5, 1, 1, 2};
        System.out.println("Array Before Sort");
        printArray1D(array3);
        System.out.println("Array After Sort");
        sort1DArray(array3);
        printArray1D(array3);


    }

    static boolean checkNumbers(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
        //    return nums.length >= 1 && nums[0] == nums[nums.length-1];
    }

    static int count(int[] nums, int value) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value)
                counter++;
        }
        return counter;
    }

    static void aufgabeC() {
        int[][] array = new int[8][8];
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j + 2;
            }
        }
        printArray2D(array);

    }


    static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void printArray1D(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void berechneSterneProZeile(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            int anzahl = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '*') {
                    anzahl++;
                }
            }
            System.out.println(i + ": " + anzahl);
        }
    }

    static int[][] transposeMatrix(int matrix[][]) {
        int temp[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[j][i];
            }
        }
        return temp;
    }

    // Searching in  1D-Array
    static boolean findNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    static boolean findNumberIn2DArray(int[][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // Sorting in 1D-Array
    static void sort1DArray(int[] array) {
        // Bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if (array[j] < array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    static void swap(int array[] ,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}