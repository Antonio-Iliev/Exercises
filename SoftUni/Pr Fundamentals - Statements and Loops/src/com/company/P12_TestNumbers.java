package com.company;

import java.util.Scanner;

public class P12_TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int thirdLine = Integer.parseInt(scanner.nextLine());


        int totalSum = 0;
        int count = 0;
        boolean pointBreak = true;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                totalSum += (i * j) * 3;
                count++;

                if (totalSum >= thirdLine) {
                    pointBreak = false;
                    System.out.printf("%d combinations\n"
                            + "Sum: %d >= %d", count, totalSum, thirdLine);
                    return;
                }
            }
        }

        if (pointBreak) {
            System.out.printf("%d combinations\n"
                    + "Sum: %d", count, totalSum);
        }
    }
}
