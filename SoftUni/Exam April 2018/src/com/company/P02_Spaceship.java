package com.company;

import java.util.Scanner;

public class P02_Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double astronautHeight = Double.parseDouble(scanner.nextLine());

        double shipVolume = width * length * height;
        double shipRoom = (astronautHeight + 0.4) * 2 * 2;

        double roomsAmount = Math.floor(shipVolume / shipRoom);

        if (roomsAmount < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (roomsAmount <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", roomsAmount);
        } else {
            System.out.println("The spacecraft is too big.");
        }


    }
}
