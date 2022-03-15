package AdvancedKurs.FX;

import java.util.*;
import java.util.function.Predicate;

public class Strams {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Baraaa");
        list.add("Hanna");
        list.add("haydar");
        list.add("Hiba");
        list.add("Rawan");

        list.stream().filter(s -> s.toLowerCase().startsWith("h")).forEach(System.out::println);

        // 0. JAVA
        // 1. DATEN BANKEN --> SQL
        // 2. A U D
        // 3. SWT
        // 4. FRAME WORKS
    }
}


