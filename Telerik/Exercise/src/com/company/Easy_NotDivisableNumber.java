package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_NotDivisableNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
