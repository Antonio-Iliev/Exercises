package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P02_RotateAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] inputLine1 = reader.readLine().split(" ");
        int turnsToRotate = Integer.parseInt(reader.readLine());

        int[] numbersArray = StringToIntArray(inputLine1);

        int[] sumArray = new int[numbersArray.length];

        for (int i = 0; i < turnsToRotate; i++) {
            numbersArray = RotateArray(numbersArray);

            for (int j = 0; j < sumArray.length; j++) {
                sumArray[j] += numbersArray[j];
            }
        }

        for (int num : sumArray
                ) {
            System.out.print(num + " ");
        }

    }

    static int[] StringToIntArray(String[] strArray) {
        int[] arrayInt = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            arrayInt[i] = Integer.parseInt(strArray[i]);
        }
        return arrayInt;
    }

    static int[] RotateArray(int[] arrayToRotate) {
        int lastNum = arrayToRotate[arrayToRotate.length - 1];

        for (int i = arrayToRotate.length - 1; i > 0; i--) {
            arrayToRotate[i] = arrayToRotate[i - 1];
        }
        arrayToRotate[0] = lastNum;

        return arrayToRotate;
    }
}
