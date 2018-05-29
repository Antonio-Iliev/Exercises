package com.company;

import java.util.Scanner;

public class P03_Cellphones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int amountPhones = Integer.parseInt(scanner.nextLine());
        String modelPhones = scanner.nextLine();

        double price = 0;
        double discount = 1;

        switch (modelPhones) {
            case "Gsm4e":
                price = 20.50;
                discount -= 0.01;
                break;
            case "Mobifon4e":
                price = 50.75;
                discount -= 0.02;
                break;
            case "Telefon4e":
                price = 115;
                discount -= 0.03;
                break;
        }


        if (amountPhones > 10 && amountPhones <= 20) {
            discount -= 0.02;
        } else if (amountPhones <= 50 && amountPhones > 20) {
            discount -= 0.05;
        } else if (amountPhones > 50) {
            discount -= 0.07;
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
