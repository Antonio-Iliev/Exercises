package com.company;

import java.util.Scanner;

public class exam03_IvanovisHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine().toLowerCase();
        String transport = scanner.nextLine().toLowerCase();

        double priceHotel = 0;
        double priceTransport = 0;

        int daysChildren = days * 3;
        int daysParents = days * 2;


        switch (destination) {
            case "miami":
                if (days <= 10 && days >= 1) {
                    priceHotel = (daysParents * 24.99 + daysChildren * 14.99) * 1.25;
                } else if (days <= 15 && days >= 11) {
                    priceHotel = (daysParents * 22.99 + daysChildren * 11.99) * 1.25;
                } else if (days >= 16) {
                    priceHotel = (daysParents * 22.0 + daysChildren * 10.0) * 1.25;
                }
                break;
            case "canary islands":
                if (days <= 10 && days >= 1) {
                    priceHotel = (daysParents * 32.5 + daysChildren * 28.5) * 1.25;
                } else if (days <= 15) {
                    priceHotel = (daysParents * 30.5 + daysChildren * 25.6) * 1.25;
                } else if (days > 15) {
                    priceHotel = (daysParents * 28.0 + daysChildren * 22.0) * 1.25;
                }
                break;
            case "philippines":
                if (days <= 10 && days >= 1) {
                    priceHotel = (daysParents * 42.99 + daysChildren * 39.99) * 1.25;
                } else if (days <= 15) {
                    priceHotel = (daysParents * 41.0 + daysChildren * 36.0) * 1.25;
                } else if (days > 15) {
                    priceHotel = (daysParents * 38.5 + daysChildren * 32.4) * 1.25;
                }
                break;
        }

        switch (transport) {
            case "train":
                priceTransport = 2 * 22.3 + 3 * 12.5;
                break;
            case "bus":
                priceTransport = 2 * 45.0 + 3 * 37.0;
                break;
            case "airplane":
                priceTransport = 2 * 90.0 + 3 * 68.5;
                break;
        }
        if (priceHotel != 0) {
            System.out.printf("%.3f", priceHotel + priceTransport);
        }

    }
}
