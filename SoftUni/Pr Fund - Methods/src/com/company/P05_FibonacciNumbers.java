package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_FibonacciNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("not a number");
        }

        System.out.println(FibonacciNumbOfN(n));

    }

    static int FibonacciNumbOfN(int numbNPosition) {
        int position1 = 0;
        int position2 = 1;
        int tempPosition = 0;

        for (int i = 0; i <= numbNPosition; i++) {
            tempPosition = position1 + position2;
            position1 = position2;
            position2 = tempPosition;
        }

        return position1;
    }
}
