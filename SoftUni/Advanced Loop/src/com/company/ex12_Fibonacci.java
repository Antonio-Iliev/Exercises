package com.company;

import java.util.Scanner;

public class ex12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < n; i++) {
            int temp = f1;
            f1 += f0;
            f0 = temp;
        }

        System.out.println(f0);

    }
}
