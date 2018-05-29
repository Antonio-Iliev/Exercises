package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P03_FoldAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inNumbArray = Arrays.stream(reader.readLine()
                .split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] middleArray = MiddlePartOfArray(inNumbArray);
        int[] foldedArray = FoldFirstLast(inNumbArray);
        int[] sumArray = SumTwoArray(foldedArray, middleArray);


        System.out.println(StringFromArray(sumArray));


    }

    static int[] FoldFirstLast(int[] inputArray) {
        int[] foldedArray = new int[inputArray.length / 2];

        for (int i = 0; i < foldedArray.length / 2; i++) {
            foldedArray[i] = inputArray[inputArray.length / 4 - 1 - i];
        }
        for (int i = 0; i < foldedArray.length / 2; i++) {
            foldedArray[foldedArray.length / 2 + i] = inputArray[inputArray.length - 1 - i];
        }

        return foldedArray;
    }

    static int[] MiddlePartOfArray(int[] inputArray) {
        int[] partArray = new int[inputArray.length / 2];

        for (int i = 0; i < partArray.length; i++) {
            partArray[i] = inputArray[i + inputArray.length / 4];
        }

        return partArray;
    }

    static int[] SumTwoArray(int[] firstArray, int[] secondArray) {
        int[] sumArray = new int[firstArray.length];

        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }
        return sumArray;
    }

    static String StringFromArray(int[] array) {
        String toPrint = Arrays.toString(array);
        toPrint = toPrint.substring(1, toPrint.length() - 1)
                .replaceAll(",", "");

        return toPrint;
    }
}
