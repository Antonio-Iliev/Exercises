package com.company;

import java.util.Scanner;

public class exam03_SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine().toLowerCase();
        String impression = scanner.nextLine().toLowerCase();

        double price = 0;


        switch (room) {
            case "room for one person":
                price = (days - 1) * 18.0;
                break;
            case "apartment":
                price = (days - 1) * 25.0;
                if (days < 10) {
                    price *= 0.7;
                } else if (days >= 10 && days <= 15) {
                    price *= 0.65;
                } else if (days > 15) {
                    price *= 0.5;
                }
                break;
            case "president apartment":
                price = (days - 1) * 35.0;
                if (days < 10) {
                    price *= 0.9;
                } else if (days >= 10 && days <= 15) {
                    price *= 0.85;
                } else if (days > 15) {
                    price *= 0.8;
                }
                break;
        }

        switch (impression) {
            case "positive":
                price *= 1.25;
                break;
            case "negative":
                price *= 0.9;
                break;
        }


        System.out.printf("%.2f", price);
    }
}

