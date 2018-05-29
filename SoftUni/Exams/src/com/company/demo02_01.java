package com.company;

import java.util.Scanner;

public class demo02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForRelax = Integer.parseInt(scanner.nextLine());
        double pricePackCards = Double.parseDouble(scanner.nextLine());
        double priceAdventure = Double.parseDouble(scanner.nextLine());
        double priceCoffee = Double.parseDouble(scanner.nextLine());

        timeForRelax -= (5 + 3 * 2 + 2 * 2);

        double sum = (pricePackCards * 3) + (priceAdventure * 2) + priceCoffee;


        System.out.printf("%.2f%n%d", sum, timeForRelax);


    }
}
