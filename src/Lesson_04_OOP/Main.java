package Lesson_04_OOP;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter    m1      =  new Mitarbeiter("Samira", 5000.0 , 20 );

        System.out.println(m1.getName() + ", "+ m1.getAlter()+ ", " + m1.getGehalt());
        m1.setName("Samera");
        m1.setGehalt(14500.0);
        m1.setAlter(19);
        System.out.println(m1.getName() + ", "+ m1.getAlter()+ ", " + m1.getGehalt());

    }
}
