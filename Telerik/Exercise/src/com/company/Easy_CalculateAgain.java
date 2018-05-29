package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Easy_CalculateAgain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        BigInteger[] factorialArray = new BigInteger[Math.max(n, k) + 1];
        factorialArray[0] = BigInteger.valueOf(1);
        for (int i = 1; i < factorialArray.length; i++) {
            factorialArray[i] = factorialArray[i - 1].multiply(BigInteger.valueOf(i));
        }

        BigDecimal result = new BigDecimal(factorialArray[n].divide(factorialArray[k]));

        System.out.println(result);

    }
}
