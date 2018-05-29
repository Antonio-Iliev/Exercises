package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P06_MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestStart = 0;
        int bestLen = 0;

        int len = 0;
        int start = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                len++;
                start = i;
            } else {
                len = 0;
                start = 0;
            }

            if (bestLen < len) {
                bestLen = len;
                bestStart = start;
            }
        }

        System.out.println(StringToPrint(inputArray, bestStart, bestLen));

    }

    static StringBuilder StringToPrint(int[] array, int startPosition, int length) {
        StringBuilder text = new StringBuilder();
        int start = startPosition - length + 1;
        int end = startPosition + 1;

        for (int i = start; i <= end; i++) {
            text.append(array[i]).append(" ");
        }

        return text;
    }
}
