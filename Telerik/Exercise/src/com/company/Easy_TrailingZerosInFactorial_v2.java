package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Easy_TrailingZerosInFactorial_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }

        String factoStr = factorial.toString();
        int countZeroes = 0;

        for (int i = factoStr.length() - 1; i > 0; i--) {
            if (factoStr.charAt(i) == '0') {
                countZeroes++;
            } else {
                System.out.println(countZeroes);
                return;
            }
        }

    }
}
