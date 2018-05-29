package com.company;

import java.util.Scanner;

public class P06_IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());


        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }

        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }

        }
    }
}
