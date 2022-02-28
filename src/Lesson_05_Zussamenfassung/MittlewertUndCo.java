package Lesson_05_Zussamenfassung;

import java.util.Scanner;

public class MittlewertUndCo {
    public static void main(String[] args) {
        int array[] = readInputs();
        System.out.print("Der eingegebne Array: ");
        printArray(array);

        System.out.println("Das minimum in Array: " + min(array));
        System.out.println("Das maximum in Array: " + max(array));
        System.out.println("Die summe des Arrays: " + summe(array));
        System.out.println("Die mittelwert des Arrays: " + mittlewert(array));

    }

    static int[] readInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe des Arrays ein: ");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Der Wert in Index (" + i + ") eingeben:");
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static int min(int array[]) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    static int max(int array[]) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    static int summe(int array[]) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    static int  mittlewert(int []array){
        return summe(array) / array.length;
    }
}
