package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Easy_CatalanNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n < 1) {
            n = 1;
        }

        BigInteger[] array = new BigInteger[n + 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = BigInteger.valueOf(0);
        }
        array[1] = BigInteger.valueOf(1);


        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                array[j] = array[j].add(array[j - 1]);
            }

            array[i + 1] = array[i];

            for (int j = i + 1; j > 1; j--) {
                array[j] = array[j].add(array[j - 1]);
            }
        }

        System.out.println(array[n + 1].subtract(array[n]));

    }
}
