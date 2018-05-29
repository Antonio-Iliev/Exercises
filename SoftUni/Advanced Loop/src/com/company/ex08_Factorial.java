package com.company;

import java.util.Scanner;

public class ex08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = n;

        if (n >= 1 && n <= 12) {
            for (int i = n - 1; i > 0; i--) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
