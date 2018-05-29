package com.company;

import java.util.Scanner;

public class demo_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scanner.nextLine());
        int secondNumb = Integer.parseInt(scanner.nextLine());
        int thirdNumb = Integer.parseInt(scanner.nextLine());


        if (firstNumb >= 1 && firstNumb <= 9
                && secondNumb >= 1 && secondNumb <= 9
                && thirdNumb >= 1 && thirdNumb <= 9) {

            for (int i = 2; i <= firstNumb; i += 2) {
                for (int j = 0; j <= secondNumb; j++) {
                    for (int k = 2; k <= thirdNumb; k += 2) {

                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }

                }

            }


        }


    }
}
