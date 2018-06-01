package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Easy_OddOrEvenProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] numbersArray = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        long sumOdd = 1;
        long sumEven = 1;

        for (int i = 0; i < numbersArray.length; i++) {
            if ((i + 1) % 2 != 0){
                sumOdd *= numbersArray[i];
            }else {
                sumEven *= numbersArray[i];
            }
        }

        if (sumOdd == sumEven){
            System.out.printf("yes %d", sumOdd);
        }else {
            System.out.printf("no %d %d", sumOdd, sumEven);
        }

    }
}
