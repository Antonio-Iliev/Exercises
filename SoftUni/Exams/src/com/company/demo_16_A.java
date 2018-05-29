package com.company;

import java.util.Scanner;

public class demo_16_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());
        int numb4 = Integer.parseInt(scanner.nextLine());

        boolean isPrime1 = true;
        boolean isPrime2 = true;
        double squareRoot1 = 0;
        double squareRoot2 = 0;

        for (int i = numb1; i <= (numb1 + numb3); i++) {
            for (int j = numb2; j <= (numb2 + numb4); j++) {

                squareRoot1 = (int) Math.floor(Math.sqrt(i));
                squareRoot2 = (int) Math.floor(Math.sqrt(j));

                isPrime1 = true;
                isPrime2 = true;

                if (i < 2) {
                    isPrime1 = false;
                }
                if (j < 2) {
                    isPrime2 = false;
                }

                for (int k = 2; k <= squareRoot1; k++) {
                    if (i % k == 0) {
                        isPrime1 = false;
                        break;
                    }

                }

                for (int k = 2; k <= squareRoot2; k++) {
                    if (j % k == 0) {
                        isPrime2 = false;
                        break;
                    }
                }

                if (isPrime1 && isPrime2) {
                    System.out.printf("%d%d%n", i, j);
                }

            }


        }

    }
}
