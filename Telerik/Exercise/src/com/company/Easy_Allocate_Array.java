package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_Allocate_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.println(array[i]);
        }
    }
}
