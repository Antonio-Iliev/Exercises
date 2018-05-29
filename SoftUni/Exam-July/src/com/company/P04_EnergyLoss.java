package com.company;

import java.util.Scanner;

public class P04_EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int dencerNub = Integer.parseInt(scanner.nextLine());

        int usedEnergy = 0;

        for (int i = 1; i <= n; i++) {
            int hours = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0 && hours % 2 == 0) {
                usedEnergy += dencerNub * 68;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                usedEnergy += dencerNub * 49;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                usedEnergy += dencerNub * 65;
            } else if (i % 2 != 0 && hours % 2 != 0) {
                usedEnergy += dencerNub * 30;
            }
        }

        int totalEnergy = dencerNub * 100 * n;

        int energyLeft = totalEnergy - usedEnergy;

        double energyLeftPerDayPerDancer = ((double) energyLeft / dencerNub) / n;


        if (energyLeftPerDayPerDancer <= 50) {
            System.out.printf("They are wasted! Energy left: %.2f", energyLeftPerDayPerDancer);
        } else {
            System.out.printf("They feel good! Energy left: %.2f", energyLeftPerDayPerDancer);
        }
    }
}