package com.company;

import java.util.Scanner;

public class P02_CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gender = scanner.nextLine().charAt(0);
        double weightKG = Double.parseDouble(scanner.nextLine());
        double heightM = Double.parseDouble(scanner.nextLine());
        int yearsOLD = Integer.parseInt(scanner.nextLine());
        String activityState = scanner.nextLine().toLowerCase();


        double formulaBNM = 0;

        switch (gender) {
            case 'm':
                formulaBNM = 66 + (13.7 * weightKG) + (5 * (heightM * 100)) - (6.8 * yearsOLD);
                break;
            case 'f':
                formulaBNM = 655 + (9.6 * weightKG) + (1.8 * (heightM * 100)) - (4.7 * yearsOLD);
                break;
        }


        double activityIndex = 0;

        switch (activityState) {
            case "sedentary":
                activityIndex = 1.2;
                break;

            case "lightly active":
                activityIndex = 1.375;
                break;

            case "moderately active":
                activityIndex = 1.55;
                break;

            case "very active":
                activityIndex = 1.725;
                break;
        }


        formulaBNM *= activityIndex;


        System.out.printf("To maintain your current weight you will need %.0f calories per day.",
                Math.ceil(formulaBNM));

    }
}
