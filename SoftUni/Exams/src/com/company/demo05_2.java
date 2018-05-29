package com.company;

import java.util.Scanner;

public class demo05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int powerOnePlayer = Integer.parseInt(scanner.nextLine());
        int bloodOfIlidan = Integer.parseInt(scanner.nextLine());

        int allPower = numberPeople * powerOnePlayer;

        if (bloodOfIlidan > allPower) {
            int diff = bloodOfIlidan - allPower;
            System.out.printf("You are not prepared! You need %d more points.", diff);
        } else {
            int diff = allPower - bloodOfIlidan;
            System.out.printf("Illidan has been slain! You defeated him with %d points.", diff);
        }

    }
}
