package AdvancedKurs.PK_Klausuren.Klausur_31_08_2021.Aufgabe_3;

import java.io.DataOutputStream;
import java.io.IOException;

public class PrimeUtil {
    private DataOutputStream out;

    public PrimeUtil(DataOutputStream out) {
        this.out = out;
    }

    public void calcPrimeNr(int n) {
        int primeNr;
        if (n == 1) {
            primeNr = 2;
            try {
                out.write(primeNr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            primeNr = 1;
            int count = 1;
            while (count != n) {
                primeNr += 2;
                if (isPrime(primeNr)) {
                    count++;
                }
            }
            try {
                out.write(primeNr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
