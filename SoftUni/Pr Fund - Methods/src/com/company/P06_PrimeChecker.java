package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_PrimeChecker {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }

        if (IsPrime(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

    static boolean IsPrime(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
            return isPrime;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }

        return isPrime;
    }
}
