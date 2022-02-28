package Lesson_03_Arrays;

public class Main {
    public static void main(String[] args) {
        int array[]  = {10,20};
        int x = array[0] ;
        int y = array[1];

        System.out.println("X before = " + x); // 10
        System.out.println("Y before = " + y); // 20

        swap(array,0,1);

        System.out.println("X after = " + x); // 20
        System.out.println("Y after = " + y); // 10
    }
    // Call by reference
    static void swap(int array[] ,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }



}
