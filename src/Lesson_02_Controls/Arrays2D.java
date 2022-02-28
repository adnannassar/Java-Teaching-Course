package Lesson_02_Controls;

public class Arrays2D {

    static char[][] array;

    public Arrays2D(int size) {
        this.array = new char[size][size];
    }

    public static void main(String[] args) {
        Arrays2D arrays2D = new Arrays2D(9);
        arrays2D.fillArray();
        arrays2D.printArray();
    }

     void fillArray() {
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 if (i == j || i + j == array.length - 1) {
                     array[i][j] = '*';
                 }
                 if (i < array.length / 2 && (j > i && j < array.length - i - 1)) {
                     array[i][j] = '1';
                 }
             }
         }
     }

     void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
