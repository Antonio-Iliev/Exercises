package com.company;

import java.util.Scanner;

public class demo08_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        String arenaName = scanner.nextLine();
        String day = scanner.nextLine();
        String itemsCondition = scanner.nextLine();

        double discount = 1;
        int itemsPrice = 0;

        switch (arenaName) {
            case "Nagrand":
                switch (day) {
                    case "Monday":
                    case "Wednesday":
                        discount = 0.95;
                        break;
                }
            case "Gurubashi":
                switch (day) {
                    case "Tuesday":
                    case "Thursday":
                        discount = 0.9;
                        break;
                }
            case "Dire Maul":
                switch (day) {
                    case "Friday":
                    case "Saturday":
                        discount = 0.93;
                        break;
                }
        }


        switch (itemsCondition) {
            case "Poor":
                itemsPrice = 7000;
                break;
            case "Normal":
                itemsPrice = 14000;
                break;
            case "Legendary":
                itemsPrice = 21000;
                break;
        }

        double oneItem = (itemsPrice * discount) / 5;
        int conterItems = 0;

        while (points >= oneItem) {
            points -= oneItem;
            conterItems++;
            if (conterItems == 5) {
                break;
            }
        }

        if (conterItems == 5) {
            System.out.printf("Items bought: %d%n" +
                    "Arena points left: %d%n" +
                    "Success!", conterItems, points);
        } else {
            System.out.printf("Items bought: %d%n" +
                    "Arena points left: %d%n" +
                    "Failure!", conterItems, points);
        }

    }
}
