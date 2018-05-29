package com.company;

import java.util.Scanner;

public class ex06_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0.0;

        if (points <= 100) {
            bonusScore = 5;
        } else if (points < 1000) {
            bonusScore = points * 0.2;
        } else {
            bonusScore = points * 0.1;
        }

        if (points % 2 == 0) {
            bonusScore = bonusScore + 1;
        }

        if (points % 10 == 5) {
            bonusScore = bonusScore + 2;
        }

        System.out.println(bonusScore);
        System.out.println(points + bonusScore);
    }
}
