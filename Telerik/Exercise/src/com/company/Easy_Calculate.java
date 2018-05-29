package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        double x = Double.parseDouble(reader.readLine());

        long[] factorialArray = new long[n + 1];
        factorialArray[0] = 1;
        for (int i = 1; i < factorialArray.length; i++) {
            factorialArray[i] = factorialArray[i - 1] * i;
        }

        double sum = 1.0;
        for (int i = 1; i <= n; i++) {
            sum += factorialArray[i] / Math.pow(x, i);
        }

        System.out.printf("%.5f", sum);

    }
}
