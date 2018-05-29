package com.company;

import java.util.Scanner;

public class exam04_ExternaEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double poor = 0;
        double satisfactory = 0;
        double good = 0;
        double veryGood = 0;
        double excellent = 0;

        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(scanner.nextLine());

            if (score <= 22.5) {
                poor++;
            } else if (score <= 40.5) {
                satisfactory++;
            } else if (score <= 58.5) {
                good++;
            } else if (score <= 76.5) {
                veryGood++;
            } else if (score <= 100) {
                excellent++;
            }
        }

        poor = (poor / n) * 100;
        satisfactory = (satisfactory / n) * 100;
        good = (good / n) * 100;
        veryGood = (veryGood / n) * 100;
        excellent = (excellent / n) * 100;


        System.out.printf("%.2f%% poor marks\n" +
                        "%.2f%% satisfactory marks \n" +
                        "%.2f%% good marks\n" +
                        "%.2f%% very good marks\n" +
                        "%.2f%% excellent marks",
                poor, satisfactory, good, veryGood, excellent);

    }
}
