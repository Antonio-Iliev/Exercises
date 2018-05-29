package com.company;

import java.util.Scanner;

public class P03_AluminiumJoineryV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJoinery = Integer.parseInt(scanner.nextLine());
        String modelJoinery = scanner.nextLine();
        String deliveryMethod = scanner.nextLine();

        if (numberJoinery > 10) {

            int priceModel = 0;
            int maxThreshold = 0;
            int minThreshold = 0;
            double discountMin = 1.0;
            double discountMax = 1.0;

            switch (modelJoinery) {
                case "90X130":
                    priceModel = 110;

                    discountMin = 0.95;
                    discountMax = 0.92;

                    minThreshold = 30;
                    maxThreshold = 60;
                    break;
                case "100X150":
                    priceModel = 140;

                    discountMin = 0.94;
                    discountMax = 0.9;

                    minThreshold = 40;
                    maxThreshold = 80;
                    break;
                case "130X180":
                    priceModel = 190;

                    discountMin = 0.93;
                    discountMax = 0.88;

                    minThreshold = 20;
                    maxThreshold = 50;
                    break;
                case "200X300":
                    priceModel = 250;

                    discountMin = 0.91;
                    discountMax = 0.86;

                    minThreshold = 25;
                    maxThreshold = 50;
                    break;
            }

            double totalPrice = numberJoinery * priceModel;

            if (numberJoinery > minThreshold && numberJoinery <= maxThreshold) {
                totalPrice *= discountMin;
            } else if (numberJoinery > maxThreshold) {
                totalPrice *= discountMax;
            }

            int deliveryPrice = 0;
            switch (deliveryMethod) {
                case "With delivery":
                    deliveryPrice = 60;
                    break;
            }

            totalPrice += deliveryPrice;

            if (numberJoinery >= 100) {
                totalPrice *= 0.96;
            }

            System.out.printf("%.2f BGN", totalPrice);

        } else {
            System.out.println("Invalid order");
        }
    }
}
