package com.company;

import java.util.Scanner;

public class P03_AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJoinery = Integer.parseInt(scanner.nextLine());
        String modelJoinery = scanner.nextLine();
        String deliveryMethod = scanner.nextLine();

        if (numberJoinery > 10) {

            int priceModel = 0;
            double discount = 1.0;

            switch (modelJoinery) {
                case "90X130":
                    priceModel = 110;
                    if (numberJoinery > 30 && numberJoinery <= 60) {
                        discount = 0.95;
                    } else if (numberJoinery > 60) {
                        discount = 0.92;
                    }
                    break;
                case "100X150":
                    priceModel = 140;
                    if (numberJoinery > 40 && numberJoinery <= 80) {
                        discount = 0.94;
                    } else if (numberJoinery > 80) {
                        discount = 0.9;
                    }
                    break;
                case "130X180":
                    priceModel = 190;
                    if (numberJoinery > 20 && numberJoinery <= 50) {
                        discount = 0.93;
                    } else if (numberJoinery > 50) {
                        discount = 0.88;
                    }
                    break;
                case "200X300":
                    priceModel = 250;
                    if (numberJoinery > 25 && numberJoinery <= 50) {
                        discount = 0.91;
                    } else if (numberJoinery > 50) {
                        discount = 0.86;
                    }
                    break;
            }

            int deliveryPrice = 0;
            switch (deliveryMethod) {
                case "With delivery":
                    deliveryPrice = 60;
                    break;
            }

            double totalPrice = ((numberJoinery * priceModel) * discount) + deliveryPrice;

            if (numberJoinery >= 100) {
                totalPrice *= 0.96;
            }

            System.out.printf("%.2f BGN", totalPrice);


        } else {
            System.out.println("Invalid order");
        }
    }
}
