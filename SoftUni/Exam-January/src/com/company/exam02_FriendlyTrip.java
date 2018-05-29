package com.company;

import java.util.Scanner;

public class exam02_FriendlyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceKM = Integer.parseInt(scanner.nextLine());
        int fuelFor100 = Integer.parseInt(scanner.nextLine());
        double fuelPrice = Double.parseDouble(scanner.nextLine());
        int friendsMoney = Integer.parseInt(scanner.nextLine());

        double fuelConsume = distanceKM * (fuelFor100 / 100.00);
        double fuelCost = fuelConsume * fuelPrice;

        if (friendsMoney >= fuelCost) {
            System.out.printf("You can take a trip. %.2f money left.", (friendsMoney - fuelCost));
        } else {
            System.out.printf("Sorry, you cannot take a trip. Each will receive %.2f money.",
                    friendsMoney / 5.0);
        }


    }
}
