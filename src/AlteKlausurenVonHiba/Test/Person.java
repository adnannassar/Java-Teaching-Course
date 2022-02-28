package AlteKlausurenVonHiba.Test;

public class Person {
    private int age;
    String name;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args) {
        String x = "hallo";
        System.out.println(x);
        Person p = new Person("Hiba",20);
        System.out.println(p);
    }
}
