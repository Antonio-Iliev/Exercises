package com.company;

import java.util.Scanner;

public class P08_CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalCal = 0;

        for (int i = 0; i < n; i++) {
            String ingredients = scanner.nextLine().toLowerCase();

            switch (ingredients) {
                case "cheese":
                    totalCal += 500;
                    break;
                case "tomato sauce":
                    totalCal += 150;
                    break;
                case "salami":
                    totalCal += 600;
                    break;
                case "pepper":
                    totalCal += 50;
                    break;

            }

        }

        System.out.println("Total calories: " + totalCal);

    }
}
