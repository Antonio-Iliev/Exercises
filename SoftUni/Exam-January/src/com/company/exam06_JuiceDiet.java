package com.company;

import java.util.Scanner;

public class exam06_JuiceDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raspberryNumb = Integer.parseInt(scanner.nextLine());
        int strawberryNumb = Integer.parseInt(scanner.nextLine());
        int cheryNumb = Integer.parseInt(scanner.nextLine());
        int restriction = Integer.parseInt(scanner.nextLine());

        double left = restriction * 1.0;
        int countChery = 0;
        int countStraw = 0;
        int countRasp = 0;

        while (true) {
            if (left >= 15 && cheryNumb != 0) {
                left -= 15;
                cheryNumb--;
                countChery++;
            } else if (left >= 7.5 && strawberryNumb != 0) {
                left -= 7.5;
                strawberryNumb--;
                countStraw++;
            } else if (left >= 4.5 && raspberryNumb != 0) {
                left -= 4.5;
                raspberryNumb--;
                countRasp++;
            } else {
                break;
            }
        }

        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %.0f ml.",
                countRasp, countStraw, countChery, restriction - left);

    }
}
