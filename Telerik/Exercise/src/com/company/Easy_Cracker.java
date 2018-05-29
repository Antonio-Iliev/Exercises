package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_Cracker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int miles = Integer.parseInt(reader.readLine());
        int MILES_FOR_KM = 1609;

        System.out.println(miles * MILES_FOR_KM);
    }
}
