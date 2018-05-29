package com.company;

import java.util.Scanner;

public class exam01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paperRolls = Double.parseDouble(scanner.nextLine());
        double fiberRolls = Double.parseDouble(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        discount = 1 - discount / 100;

        double budget = (paperRolls * 5.8) + (fiberRolls * 7.2) + (glue * 1.2);

        System.out.printf("%.3f", budget * discount);

    }
}
