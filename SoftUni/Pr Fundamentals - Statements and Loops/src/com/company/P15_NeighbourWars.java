package com.company;

import java.util.Scanner;

public class P15_NeighbourWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peshoDamage = Integer.parseInt(scanner.nextLine());
        int goshoDamage = Integer.parseInt(scanner.nextLine());

        int roundCounter = 0;
        int peshoHP = 100;
        int goshoHP = 100;

        while (true) {
            roundCounter++;
            if (roundCounter % 2 != 0) {
                goshoHP -= peshoDamage;
                if (goshoHP <= 0) {
                    System.out.printf("Pesho won in %dth round.", roundCounter);
                    break;
                } else {
                    System.out.printf("Pesho used Roundhouse kick" +
                            " and reduced Gosho to %d health.\n", goshoHP);
                }
            } else {
                peshoHP -= goshoDamage;
                if (peshoHP <= 0) {
                    System.out.printf("Gosho won in %dth round.", roundCounter);
                    break;
                } else {
                    System.out.printf("Gosho used Thunderous fist" +
                            " and reduced Pesho to %d health.\n", peshoHP);
                }
            }

            if (roundCounter % 3 == 0) {
                goshoHP += 10;
                peshoHP += 10;
            }

        }


    }
}
