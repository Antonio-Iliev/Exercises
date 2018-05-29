package com.company;

import java.util.Scanner;

public class exam06_MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        int numb01 = Character.getNumericValue(numbers.charAt(0));
        int numb02 = Character.getNumericValue(numbers.charAt(1));
        int numb03 = Character.getNumericValue(numbers.charAt(2));


        for (int i = 1; i <= numb03; i++) {
            for (int j = 1; j <= numb02; j++) {
                for (int k = 1; k <= numb01; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, (i * j * k));
                }

            }

        }
    }
}
