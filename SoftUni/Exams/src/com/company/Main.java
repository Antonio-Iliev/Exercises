package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;
        int test = 0;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    test = 0;
                } else {
                    test = i;
                    System.out.println(test);
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime" + n);
        } else {
            System.out.println("Not Prime");
        }


    }
}
