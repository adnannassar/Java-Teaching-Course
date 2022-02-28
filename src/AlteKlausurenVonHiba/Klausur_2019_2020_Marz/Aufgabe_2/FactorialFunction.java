package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_2;


public class FactorialFunction implements LongUnaryOperator {


    public long applyAsLong(long n) {
        long result = 1;
        for (long i = n; i > 1; i--) {
            result *= i;
            // test 
        }
        return result;
    }

}
