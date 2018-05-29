package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P13_Factorial {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Not a integer");
        }

        System.out.println(FactorialOfNum(n));
    }

    static BigInteger FactorialOfNum(int number) {
        BigInteger factorialResult = BigInteger.valueOf(1);

        for (int i = 1; i <= number; i++) {
            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }

        return factorialResult;
    }
}
