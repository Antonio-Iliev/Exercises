package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_MatrixOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
