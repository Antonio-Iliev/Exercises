package com.company;

import java.util.Scanner;

public interface exam03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String typeService = scanner.nextLine().toLowerCase();
        int distance = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (typeService) {
            case "standard":
                if (weight < 1) {
                    price = distance * 0.03;
                } else if (weight <= 10) {
                    price = distance * 0.05;
                } else if (weight <= 40) {
                    price = distance * 0.1;
                } else if (weight <= 90) {
                    price = distance * 0.15;
                } else if (weight <= 150) {
                    price = distance * 0.2;
                }
                break;
            case "express":
                if (weight < 1) {
                    double additionalCosts = ((0.03 * 0.8) * weight) * distance;
                    price = (distance * 0.03) + additionalCosts;
                } else if (weight <= 10) {
                    double additionalCosts = ((0.05 * 0.4) * weight) * distance;
                    price = (distance * 0.05) + additionalCosts;
                } else if (weight <= 40) {
                    double additionalCosts = ((0.1 * 0.05) * weight) * distance;
                    price = (distance * 0.1) + additionalCosts;
                } else if (weight <= 90) {
                    double additionalCosts = ((0.15 * 0.02) * weight) * distance;
                    price = (distance * 0.15) + additionalCosts;
                } else if (weight <= 150) {
                    double additionalCosts = ((0.2 * 0.01) * weight) * distance;
                    price = (distance * 0.2) + additionalCosts;
                }
                break;
        }


        System.out.printf("The delivery of your shipment with weight of %.3f kg. " +
                "would cost %.2f lv.", weight, price
        );

    }
}
