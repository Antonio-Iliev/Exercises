package com.company;

import java.util.Scanner;

public class M1_P02_PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String printPrimeNumb = "";

        int lastPrime = 0;

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                for (int j = lastPrime + 1; j < i; j++) {
                    printPrimeNumb += "0";
                }
                printPrimeNumb += "1";

                System.out.println(printPrimeNumb);

                lastPrime = i;
            }
        }
    }
}
