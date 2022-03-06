package Aufgabe3;

public class Test {
    public static void main(String[] args) {
        /*
        Smartphone iphone=  new Smartphone(001,"012351978123", 6.4);
        iphone.addSMS(00100,"Hallo");
        iphone.addSMS(00101,"Wie geht's");
        iphone.addSMS(00102,"gut danke!");
        iphone.ausgabeSMS();
         */
        String name = "Hamod";
        int age = 26;
        System.out.println(name + ", " + age); // Hamod, 26

        Person person = new Person("Hamod", 26);

        System.out.println(person.toString()); //


    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+ ", " +age;
    }
}
