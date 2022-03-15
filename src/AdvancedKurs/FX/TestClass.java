package AdvancedKurs.FX;

public class TestClass implements TestFunktionalInterface {

    @Override
    public boolean test(Object o) {
        return (Integer) o > 3;
    }

    @Override
    public boolean test(int i) {
        return false;
    }
}
