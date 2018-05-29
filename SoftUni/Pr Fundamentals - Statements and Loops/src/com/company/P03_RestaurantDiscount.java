package com.company;

import java.util.Scanner;

public class P03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String pack = scanner.nextLine();

        if (groupSize > 0 && groupSize <= 120) {

            int priceHall = 0;
            int pricePackage = 0;
            double discount = 0;
            String offerHall = "";

            if (groupSize <= 50) {
                priceHall = 2500;
                offerHall += "Small Hall";
            } else if (groupSize <= 100) {
                priceHall = 5000;
                offerHall += "Terrace";
            } else {
                priceHall = 7500;
                offerHall += "Great Hall";
            }

            switch (pack) {
                case "Normal":
                    pricePackage = 500;
                    discount = 0.95;
                    break;
                case "Gold":
                    pricePackage = 750;
                    discount = 0.9;
                    break;
                case "Platinum":
                    pricePackage = 1000;
                    discount = 0.85;
                    break;
            }

            double nominalPrice = (priceHall + pricePackage) * discount;
            double pricePerPerson = nominalPrice / groupSize;

            System.out.printf("We can offer you the %s\n" +
                    "The price per person is %.2f$", offerHall, pricePerPerson);

        } else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}
