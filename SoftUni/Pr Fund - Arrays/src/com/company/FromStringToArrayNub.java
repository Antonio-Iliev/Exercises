package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class FromStringToArrayNub {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = Arrays.stream(
                reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(input));

        int[] inputInt2 = Arrays.stream(reader.readLine()
                .split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();


        System.out.println(Arrays.toString(inputInt2));
    }
}
