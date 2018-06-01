package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Easy_GetLargestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(GetMax(inputArray));

    }

    static int GetMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

}
