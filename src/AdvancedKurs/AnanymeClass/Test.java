package AdvancedKurs.AnanymeClass;


import java.util.Comparator;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<Person>  personen = new LinkedList<>();

        personen.add(new Person("Hiba", 22));
        personen.add(new Person("Haydar", 18));



        personen.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

    }

}
