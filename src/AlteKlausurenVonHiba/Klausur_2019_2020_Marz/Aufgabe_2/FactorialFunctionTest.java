package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_2;

public class FactorialFunctionTest {
    public static void main(String[] args) {
        if(args.length == 1){
            long n = Long.parseLong(args[1]);
            FactorialFunction factorialFunction = new FactorialFunction();
            long factorialOfN = factorialFunction.applyAsLong(n);
            System.out.println(factorialOfN);
        }
    }
}
