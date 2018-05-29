package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_NumbersiInReversedOrder {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numbers = "";

        try {
            numbers = reader.readLine();
        } catch (IOException e) {
            System.out.println("Didn't read correctly");
        }

        System.out.println(ReversdOrder(numbers));

    }

    static String ReversdOrder(String strToRevers) {
        String newReveesdString = "";

        for (int i = strToRevers.length() - 1; i >= 0; i--) {
            char ch = strToRevers.charAt(i);
            newReveesdString += ch;
        }

        return newReveesdString;
    }

}
