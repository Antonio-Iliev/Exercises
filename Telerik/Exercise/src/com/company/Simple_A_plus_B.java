package com.company;


import java.util.Scanner;

public class Simple_A_plus_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);
        }

    }
}
