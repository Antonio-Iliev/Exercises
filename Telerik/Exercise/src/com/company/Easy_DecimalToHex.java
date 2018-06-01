package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_DecimalToHex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(reader.readLine());

        String result = Long.toString(input, 16).toUpperCase();

        System.out.println(result);
    }
}
