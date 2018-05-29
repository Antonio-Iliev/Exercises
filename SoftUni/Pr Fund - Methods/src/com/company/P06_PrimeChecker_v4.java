package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P06_PrimeChecker_v4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strInput = "";


        try {
            strInput = reader.readLine();
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }


        if (IsPrime(strInput)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    static boolean IsPrime(String strNumber) {

        long number = Long.parseLong(strNumber);

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
