package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length; j++) {
                sum += myArray[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            sum = 0;
        }

        System.out.print(maxSum);
    }
}
