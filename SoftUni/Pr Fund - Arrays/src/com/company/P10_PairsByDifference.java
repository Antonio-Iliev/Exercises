package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10_PairsByDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayOfInt = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        int difference = Integer.parseInt(reader.readLine());

        int count = 0;


        for (int i = 0; i < arrayOfInt.length - 1; i++) {
            for (int j = i + 1; j < arrayOfInt.length; j++) {
                if (arrayOfInt[i] - arrayOfInt[j] == difference
                        || arrayOfInt[j] - arrayOfInt[i] == difference) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
