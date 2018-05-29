package com.company;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        int count = 1;
        int maxSequence = 0;

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i - 1] < myArray[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxSequence) {
                maxSequence = count;
            }
        }

        System.out.println(maxSequence);
    }
}
