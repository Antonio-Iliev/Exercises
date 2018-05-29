package com.company;

import java.util.Scanner;

public class P02_ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberANDtoBuild = Integer.parseInt(scanner.nextLine());
        int numberEmploys = Integer.parseInt(scanner.nextLine());
        int workingDys = Integer.parseInt(scanner.nextLine());

        int workHours = numberEmploys * workingDys * 8;

        int numberAND = workHours / 3;

        if (numberANDtoBuild <= numberAND) {
            double price = (numberAND - numberANDtoBuild) * 110.1;
            System.out.printf("Profit: -> %.2f BGN", price);
        } else {
            double price = (numberANDtoBuild - numberAND) * 110.1;
            System.out.printf("Losses: -> %.2f BGN", price);
        }

    }
}
