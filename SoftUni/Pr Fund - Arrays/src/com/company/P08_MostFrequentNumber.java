package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P08_MostFrequentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();


        int mostFrequentNum = 0;
        int bestLen = 0;

        int len = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    len++;
                }

                if (len > bestLen) {
                    bestLen = len;
                    mostFrequentNum = inputArray[i];
                }
            }

            len = 0;
        }

        System.out.println(mostFrequentNum);
    }
}
