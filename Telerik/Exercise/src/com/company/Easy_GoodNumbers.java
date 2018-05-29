package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Easy_GoodNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            int[] array = Arrays.stream(Integer.toString(i).split(""))
                    .filter(value -> value != null && value.length() > 0 && !value.equals("0"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            boolean isDavide = false;

            for (int num : array) {
                if (i % num == 0) {
                    isDavide = true;
                } else {
                    isDavide = false;
                    break;
                }
            }

            if (isDavide) {
                count++;
            }
        }

        System.out.println(count);
    }
}
