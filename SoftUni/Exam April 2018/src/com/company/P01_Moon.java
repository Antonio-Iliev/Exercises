package com.company;

import java.util.Scanner;

public class P01_Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());

        int distance = 384400 * 2;

        double timeGoAndReturn = Math.ceil(distance / speed);

        double totalTime = timeGoAndReturn + 3;

        double totalFuel = (fuel * distance) / 100;

        System.out.printf("%.0f\n%.0f", totalTime, totalFuel);

    }
}
