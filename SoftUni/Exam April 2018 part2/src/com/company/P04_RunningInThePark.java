package com.company;

import java.util.Scanner;

public class P04_RunningInThePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalDistance = 0;
        int totalMin = 0;
        int totalCalories = 0;

        for (int i = 0; i < n; i++) {
            int timeInMinutes = Integer.parseInt(scanner.nextLine());
            double distanceDay = Double.parseDouble(scanner.nextLine());
            String measurementUnit = scanner.nextLine().toLowerCase();

            totalMin += timeInMinutes;

            switch (measurementUnit) {
                case "m":
                    totalDistance += distanceDay / 1000;
                    break;
                case "km":
                    totalDistance += distanceDay;
                    break;
            }

            totalCalories += (timeInMinutes / 20.0) * 400;
        }


        System.out.printf("He ran %.2fkm for %d minutes and burned %d calories.",
                totalDistance, totalMin, totalCalories);
    }
}
