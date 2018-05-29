package com.company;

import java.util.Scanner;

public class ex02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (city) {
            case "sofia":
                switch (product) {
                    case "coffee":
                        price = .5;
                        break;
                    case "water":
                        price = .8;
                        break;
                    case "beer":
                        price = 1.2;
                        break;
                    case "sweets":
                        price = 1.45;
                        break;
                    case "peanuts":
                        price = 1.6;
                        break;
                }
                break;
            case "plovdiv":
                switch (product) {
                    case "coffee":
                        price = .4;
                        break;
                    case "water":
                        price = .7;
                        break;
                    case "beer":
                        price = 1.15;
                        break;
                    case "sweets":
                        price = 1.30;
                        break;
                    case "peanuts":
                        price = 1.5;
                        break;
                }
                break;
            case "varna":
                switch (product) {
                    case "coffee":
                        price = .45;
                        break;
                    case "water":
                        price = .7;
                        break;
                    case "beer":
                        price = 1.1;
                        break;
                    case "sweets":
                        price = 1.35;
                        break;
                    case "peanuts":
                        price = 1.55;
                        break;
                }
                break;
        }

        double result = quantity * price;

        System.out.println(result);


    }
}
