package com.company;

import java.util.Scanner;

public class P01_DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double withe = Double.parseDouble(scanner.nextLine());
        double garderob = Double.parseDouble(scanner.nextLine());

        lenght *= 100;
        withe *= 100;
        garderob *= 100;

        double hallSM2 = lenght * withe;
        garderob *= garderob;
        double peikaCM2 = hallSM2 / 10.0;

        double freeSpace = hallSM2 - garderob - peikaCM2;

        double dancerNumb = freeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancerNumb));

    }
}