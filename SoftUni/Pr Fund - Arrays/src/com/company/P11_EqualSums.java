package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11_EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        if (array.length == 1) {
            System.out.println(0);
            return;
        }

        boolean isFound = false;
        boolean sumIsZero = false;

        for (int i = 0; i < array.length; i++) {
            int[] left = Arrays.copyOf(array, i);
            int[] right = Arrays.copyOfRange(array, i + 1, array.length);

            int sumLeft = Arrays.stream(left).sum();
            int sumRight = Arrays.stream(right).sum();


            if (sumLeft == sumRight && sumLeft != 0) {
                System.out.println(i);
                isFound = true;
                return;
            } else if (sumLeft == sumRight) {
                System.out.println(0);
                return;
            }
        }

        System.out.println("no");

    }
}
