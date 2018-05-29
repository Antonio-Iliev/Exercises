package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P14_FactorialTrailingZeroes {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Not a integer");
        }

        System.out.println(TrailingZeroes(FactorialOfNum(n)));
    }

    static BigInteger FactorialOfNum(int number) {
        BigInteger factorialResult = BigInteger.valueOf(1);

        for (int i = 1; i <= number; i++) {
            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }

        return factorialResult;
    }

    static int TrailingZeroes(BigInteger number) {
        String inputNub = "" + number;
        int countOfZeroes = 0;

        for (int i = inputNub.length() - 1; i > 0; i--) {
            if (inputNub.charAt(i) == '0') {
                countOfZeroes++;
            } else {
                return countOfZeroes;
            }
        }


        return countOfZeroes;
    }
}
