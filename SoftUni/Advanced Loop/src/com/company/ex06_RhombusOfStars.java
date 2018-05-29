package com.company;

import java.util.Scanner;

public class ex06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }

            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
