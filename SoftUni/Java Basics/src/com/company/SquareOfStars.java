package com.company;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
