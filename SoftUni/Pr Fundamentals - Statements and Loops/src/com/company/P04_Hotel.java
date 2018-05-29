package com.company;

import java.util.Scanner;

public class P04_Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double doubleRoom = 0;
        double suite = 0;


        switch (month) {
            case "May":
            case "October":
                studio = 50.0;
                doubleRoom = 65.0;
                suite = 75.0;
                break;
            case "June":
            case "September":
                studio = 60.0;
                doubleRoom = 72.0;
                suite = 82.0;
                break;
            case "July":
            case "August":
            case "December":
                studio = 68.0;
                doubleRoom = 77.0;
                suite = 89.0;
                break;
        }

        double studioPrice = studio * nights;
        double doubleRoomPrice = doubleRoom * nights;
        double suitePrice = suite * nights;

        if (nights > 7) {
            switch (month) {
                case "May":
                    studioPrice *= 0.95;
                    break;
                case "September":
                    studioPrice -= studio;
                    break;
                case "October":
                    studioPrice -= studio;
                    studioPrice *= 0.95;

                    break;
            }
        }

        if (nights > 14) {
            switch (month) {
                case "June":
                case "September":
                    doubleRoomPrice *= 0.90;
                    break;
                case "July":
                case "August":
                case "December":
                    suitePrice *= 0.85;
                    break;
            }
        }


        System.out.printf("Studio: %.2f lv.\n" +
                "Double: %.2f lv.\n" +
                "Suite: %.2f lv.", studioPrice, doubleRoomPrice, suitePrice);

    }
}
