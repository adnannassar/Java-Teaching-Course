package AdvancedKurs.AnanymeClass;

public class Person{
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.equals(0));
    }
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
