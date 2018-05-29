package com.company;

import java.util.Scanner;

public class ex14_NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(number + " ");
                number++;

            }

            System.out.println();

        }
    }
}
