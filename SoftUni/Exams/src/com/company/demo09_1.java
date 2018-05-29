package com.company;

import java.util.Scanner;

public class demo09_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherCount = 0;

        double points = 0;

        for (int i = 0; i < n; i++) {

            String colorName = scanner.nextLine().toLowerCase();

            switch (colorName) {
                case "red":
                    points += 5;
                    redCount++;
                    break;
                case "orange":
                    points += 10;
                    orangeCount++;
                    break;
                case "yellow":
                    points += 15;
                    yellowCount++;
                    break;
                case "white":
                    points += 20;
                    whiteCount++;
                    break;
                case "black":
                    points /= 2;
                    blackCount++;
                    break;
                default:
                    otherCount++;

            }
        }
        System.out.printf("Total points: %.0f%n" +
                        "Points from red balls: %d%n" +
                        "Points from orange balls: %d%n" +
                        "Points from yellow balls: %d%n" +
                        "Points from white balls: %d%n" +
                        "Other colors picked: %d%n" +
                        "Divides from black balls: %d",
                Math.floor(points), redCount, orangeCount, yellowCount, whiteCount, otherCount, blackCount);
    }
}
