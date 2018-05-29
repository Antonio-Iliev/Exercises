package com.company;

import java.util.Scanner;

public class P03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancer = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double price = 0.0;
        double procentage = 1.0;

        switch (place) {
            case "Bulgaria":
                price = points * dancer;

                switch (season) {
                    case "summer":
                        procentage = .95;
                        break;
                    case "winter":
                        procentage = .92;
                        break;
                }
                break;
            case "Abroad":
                price = points * dancer;
                price *= 1.5;

                switch (season) {
                    case "summer":
                        procentage = .9;
                        break;
                    case "winter":
                        procentage = .85;
                        break;
                }
                break;
        }

        price *= procentage;

        double charity = price * .75;
        price -= charity;

        System.out.printf("Charity - %.2f\n" +
                "Money per dancer - %.2f", charity, price / dancer);

    }
}
