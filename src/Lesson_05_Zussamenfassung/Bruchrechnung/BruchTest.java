package Lesson_05_Zussamenfassung.Bruchrechnung;

public class BruchTest {
    public static void main(String[] args) {

        Bruch b1 = new Bruch(2,3);
        Bruch b2 = new Bruch(5,6);


        System.out.println("Bruch b1: " + b1);
        System.out.println("Bruch b2: " + b2);

        b1.multipliziere(2);
        System.out.println("b1 * 2 = " + b1);
        System.out.println("Neue b1: " + b1);

        b2.multipliziere(b1);
        System.out.println("b2 * b1 = " + b2);
        System.out.println("Neue b2: " + b2);

       Bruch b3 = b1.dividiere(b2);
       System.out.println("b1 / b2 = " + b3);

    }
}
