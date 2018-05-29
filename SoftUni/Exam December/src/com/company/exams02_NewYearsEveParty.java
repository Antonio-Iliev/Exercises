package com.company;

import java.util.Scanner;

public class exams02_NewYearsEveParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsBudget = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        guestsBudget *= 20;


        if (budget >= guestsBudget) {
            double fireworks = (budget - guestsBudget) * .4;
            double donations = budget - guestsBudget - fireworks;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.",
                    fireworks, donations);

        } else {
            System.out.printf("They won't have enough money to pay the covert. " +
                    "They will need %d lv more.", guestsBudget - budget
            );
        }

    }
}
