package com.company;

import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 1;
        int maxSequence = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                count++;
            } else count = 1;
            if (count > maxSequence) {
                maxSequence = count;
            }

        }
        System.out.println(maxSequence);
    }
}
