package com.company;

import java.util.Scanner;

public class exam06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();

        int minNumb1 = Character.getNumericValue(n1.charAt(0));
        int minNumb2 = Character.getNumericValue(n1.charAt(1));
        int minNumb3 = Character.getNumericValue(n1.charAt(2));
        int minNumb4 = Character.getNumericValue(n1.charAt(3));

        int maxNumb1 = Character.getNumericValue(n2.charAt(0));
        int maxNumb2 = Character.getNumericValue(n2.charAt(1));
        int maxNumb3 = Character.getNumericValue(n2.charAt(2));
        int maxNumb4 = Character.getNumericValue(n2.charAt(3));

        for (int i = minNumb1; i <= maxNumb1; i++) {
            for (int j = minNumb2; j <= maxNumb2; j++) {
                for (int k = minNumb3; k <= maxNumb3; k++) {
                    for (int l = minNumb4; l <= maxNumb4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }

                }

            }

        }

    }
}
