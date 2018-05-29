package com.company;

import java.util.Scanner;

public class MaxSumOfSubsequencev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        int current = myArray[0];
        int maxSum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            current = Math.max(myArray[i], current + myArray[i]);

            if (current > maxSum) {
                maxSum = current;
            }
        }

        System.out.print(maxSum);
    }
}
