package AlteKlausurenVonHiba.Test;

public class ComplexNumber {
    int number;
    int i;

    public ComplexNumber(int number, int i) {
        this.i = i;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "+" + i + "i";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 5);
        System.out.println(c1);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

    }
}
