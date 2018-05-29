package com.company;

import java.util.Scanner;

public class P03_SolarSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DAYS_PER_UNIT = 226;

        String planetName = scanner.nextLine().toLowerCase();
        int dayOnPlanet = Integer.parseInt(scanner.nextLine());

        double distance = 0;
        int daysLimit = 0;

        switch (planetName) {
            case "mercury":
                distance = 2 * 0.61;
                daysLimit = 7;
                break;
            case "venus":
                distance = 2 * 0.28;
                daysLimit = 14;
                break;
            case "mars":
                distance = 2 * 0.52;
                daysLimit = 20;
                break;
            case "jupiter":
                distance = 2 * 4.2;
                daysLimit = 5;
                break;
            case "saturn":
                distance = 2 * 8.52;
                daysLimit = 3;
                break;
            case "uranus":
                distance = 2 * 18.21;
                daysLimit = 3;
                break;
            case "neptune":
                distance = 2 * 29.09;
                daysLimit = 2;
                break;
            default:
                System.out.println("Invalid planet name!");
                break;
        }

        double numberDays = distance * DAYS_PER_UNIT + dayOnPlanet;

        if (daysLimit > 0 && daysLimit >= dayOnPlanet) {
            System.out.printf("Distance: %.2f\n" +
                    "Total number of days: %.2f", distance, numberDays);
        } else if (daysLimit > 0) {
            System.out.println("Invalid number of days!");
        }
    }
}
