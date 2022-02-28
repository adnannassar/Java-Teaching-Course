package AlteKlausurenVonHiba.klasur2020;

public class Aufgabe3 {
    public static void main(String[] args) {
        C c = new C();
        A a = new B();
        System.out.println(c.x + 2);
        if (!a.e) {
            System.out.println(c.z);
        } else {
            System.out.println("HI");
        }
        System.out.println(a.y);
        c.ausgabe();
        a.ausgabe();
        a = c;
        a.ausgabe();
    }

    static abstract class A {
        boolean e = true;
        int x = 5;
        String y = "A";

        public abstract void ausgabe();
    }

    static class B extends A {
        String z = "B";

        public void ausgabe() {
            System.out.println(z);
        }
    }

    static class C extends B {
        public void ausgabe() {
            System.out.println("C");
        }
    }

}
