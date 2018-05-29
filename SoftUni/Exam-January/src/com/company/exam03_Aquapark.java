package com.company;

import java.util.Scanner;

public class exam03_Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mounts = scanner.nextLine().toLowerCase();
        int h = Integer.parseInt(scanner.nextLine());
        int peoples = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine().toLowerCase();


        double price = 0;

        switch (mounts) {
            case "march":
            case "april":
            case "may":
                switch (dayOrNight) {
                    case "day":
                        price = 10.50;
                        break;
                    case "night":
                        price = 8.4;
                        break;
                }
                break;
            case "june":
            case "july":
            case "august":
                switch (dayOrNight) {
                    case "day":
                        price = 12.60;
                        break;
                    case "night":
                        price = 10.20;
                        break;
                }
                break;
        }


        if (peoples >= 4) {
            price *= 0.9;
        }
        if (h >= 5) {
            price *= 0.5;
        }

        if (price > 0) {
            System.out.printf("Price per person for one hour: %.2f%n" +
                    "Total cost of the visit: %.2f", price, (price * h * peoples));
        }

    }
}
