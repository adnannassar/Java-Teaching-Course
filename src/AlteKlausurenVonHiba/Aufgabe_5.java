package AlteKlausurenVonHiba;

public class Aufgabe_5 {
    public static void main(String[] args) {
        A a = new B();
        C c = new C();
        System.out.println(c.x - 4);
        System.out.println(a.y);
        if (a.t) {
            System.out.println(a.x);
        }else{
            System.out.println("-");
        }
        a.ausgabe();
        c.ausgabe();
        a = c;
        a.ausgabe();
    }
}

abstract class A {
    boolean t = false;
    int x = 5;
    String y = "A";

    public abstract void ausgabe();
}

class B extends A {
    String z = "B";

    public void ausgabe() {
        System.out.println(z);
    }
}

class C extends B {
    public void ausgabe() {
        System.out.println("C");
    }
}


