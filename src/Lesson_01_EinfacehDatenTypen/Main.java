package Lesson_01_EinfacehDatenTypen;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("For Loop:        ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        System.out.print("While Loop:      ");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + "\t");
            start++;
        }

        System.out.println();

        System.out.print("Do While Loop:   ");
        int j = 1;
        do {
            System.out.print(j + "\t");
            j++;
        } while (j <= 10);

    }


    static int calculate(int x, int y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0) {
                    return -1;
                } else {
                    return x / y;
                }
            default:
                return -1;
        }
    }

    static void readUserInputs() {
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter the Operation (+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();

        System.out.println("Result: " + calculate(x, y, operation));
    }
}

