package AlteKlausurenVonHiba.Klausur_2019_2020.Aufgabe_4;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(countDivider(10));
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));
        printPrimeNumbers(primeNumbers(20));
    }


    private static int countDivider(int n) {
        if (n <= 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return true;
        } else {
            if (countDivider(n) == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static int[] primeNumbers(int n) {
        int[] array = new int[n];
        int i = 2;
        int counter = 0;
        while (true) {
            if( counter == n){
                break;
            }
            if (isPrime(i)) {
                array[counter++] = i;
            }
            i++;
        }
        return array;
    }


    private static void printPrimeNumbers(int[] ps) {
        for (int i = 0; i < ps.length; i++) {
            System.out.print(ps[i] + " ");
        }
    }
}
