package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_6;

public class HappyNumbers {
    public static void main(String[] args) {
        System.out.println(sumDigitSquare(13));
        System.out.println(isHappy(13));
        System.out.println(isHappy(14));
        printHappyNumbers(happyNumbers(10));
    }


    private static void printHappyNumbers(int[] hn) {
        for (int i = 0; i < hn.length; i++) {
            System.out.print(hn[i] + " ");
        }
    }

    private static int sumDigitSquare(int n) {
        int summe = 0;
        int tempOfModulo;
        while (n > 0) {
            tempOfModulo = n % 10;
            summe += tempOfModulo * tempOfModulo;
            n /= 10;
        }
        return summe;
    }

    private static boolean isHappy(int n) {
        int result = n;
        while (result != 1 && result != 4) {
            result = sumDigitSquare(result);
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] happyNumbers(int k) {
        int[] result = new int[k];
        int i = 1;
        int counter = 0;
        while (true) {
            if (counter == k) {
                break;
            }
            if (isHappy(i)) {
                result[counter] = i;
                counter++;
            }
            i++;
        }
        return result;
    }
}
