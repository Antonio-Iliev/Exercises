package com.company;

import java.util.Scanner;

public class P03_CellphonesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int amountPhones = Integer.parseInt(scanner.nextLine());
        String modelPhones = scanner.nextLine();

        double price = 0;
        double discount = 0;

        switch (modelPhones) {
            case "Gsm4e":
                price = 20.50;
                if (amountPhones <= 10) {
                    discount = 0.99;
                } else if (amountPhones <= 20) {
                    discount = 0.97;
                } else if (amountPhones <= 50) {
                    discount = 0.94;
                } else {
                    discount = 0.92;
                }
                break;
            case "Mobifon4e":
                price = 50.75;
                if (amountPhones <= 10) {
                    discount = 0.98;
                } else if (amountPhones <= 20) {
                    discount = 0.96;
                } else if (amountPhones <= 50) {
                    discount = 0.93;
                } else {
                    discount = 0.91;
                }
                break;
            case "Telefon4e":
                price = 115;
                if (amountPhones <= 10) {
                    discount = 0.97;
                } else if (amountPhones <= 20) {
                    discount = 0.95;
                } else if (amountPhones <= 50) {
                    discount = 0.92;
                } else {
                    discount = 0.90;
                }
                break;
        }


        double totalPrice = (price * amountPhones) * discount;

        if (budget >= totalPrice) {
            System.out.printf("The company bought all mobile phones." +
                    " %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money for all mobiles." +
                    " Company needs %.2f more leva.", totalPrice - budget);
        }

    }
}
