package com.company;

import java.util.Scanner;

public class demo05_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int chocolate = Integer.parseInt(scanner.nextLine());
        double milk = Double.parseDouble(scanner.nextLine());
        double mandarins = Math.floor(chocolate * 0.65);

        double priceChoco = chocolate * 0.65;
        double priceMilk = milk * 2.7;
        double priceMandarins = mandarins * 0.2;

        double sum = priceChoco + priceMilk + priceMandarins;

        if (budget >= sum) {
            double diff = budget - sum;
            System.out.printf("You got this, %.2f money left!", diff);
        } else {
            double diff = sum - budget;
            System.out.printf("Not enough money, you need %.2f more!", diff);
        }

    }
}
