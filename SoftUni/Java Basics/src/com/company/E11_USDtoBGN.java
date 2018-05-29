package com.company;

import java.util.Scanner;

public class E11_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double usd = 1.79549;

        double bgn = money * usd;

        System.out.printf("%.2f BGN%n", bgn);
    }
}
