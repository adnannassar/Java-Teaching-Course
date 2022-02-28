package Klausur_02_2022.Aufgabe_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Dealership {
    public static void main(String[] args) {
        List<Car> list = new LinkedList<>();
        list.add(new Car("Tesla", "520", "Black", 1));
        list.add(new Car("BWM", "320", "Yellow", 1));
        list.add(new Car("Tesla", "420", "White", 1));
        list.add(new Car("BWM", "120", "Red", 1));

        System.out.println(totalPriceOf(list));
        System.out.println(totalNumberOf(new CarTeslaPredicate(), list));
    }

    public static Optional<Car> mostExpensive(List<Car> liste) {
        return liste.stream().max((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()));
    }

    public static double totalPriceOf(List<Car> liste) {
        return liste.stream().map(car -> car.getPrice()).reduce(0.0, (a, b) -> a + b);
    }

    public static long totalNumberOf(Predicate<Car> p, List<Car> list) {
        return list.stream().filter(p).count();
    }
}
