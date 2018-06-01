package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Easy_Windows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        double price = scanner.nextDouble();

        double totalArea = 0;

        for (int i = 0; i < number; i++) {
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            int isBroken = scanner.nextInt();

            if (isBroken == 1) {
                totalArea += side1 * side2;
            }
        }

        double finalPrice = totalArea * price;

        DecimalFormat f = new DecimalFormat("0.####");
        System.out.println(f.format(finalPrice));

    }
}
