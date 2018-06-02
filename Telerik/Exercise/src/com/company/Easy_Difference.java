package com.company;

import java.util.Scanner;

public class Easy_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.abs(a - b));
    }
}
