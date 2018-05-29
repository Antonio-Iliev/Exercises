package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P06_PrimeChecker_v2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        BigInteger num = BigInteger.valueOf(0);

        try {
            num = new BigInteger(reader.readLine());
        } catch (IOException e) {
            num = BigInteger.valueOf(0);
            System.out.println("It isn't a number");
        }

        if (IsPrime(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    static boolean IsPrime(BigInteger bigNumber) {

        BigInteger bigNumberSqrt = bigNumber.sqrt();
        int number = Integer.parseInt(bigNumberSqrt.toString());

        boolean isPrime = true;

        if (bigNumber.equals(BigInteger.ZERO) || bigNumber.equals(BigInteger.ONE)) {
            return false;
        }

        for (int i = 2; i <= number; i++) {
            int compere = Integer.parseInt(bigNumber.mod(BigInteger.valueOf(i)).toString());

            if (compere == 0) {
                return false;
            }
        }

        return isPrime;
    }
}
