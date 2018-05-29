package com.company;

import java.util.Scanner;

public class exam02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKG = Integer.parseInt(scanner.nextLine());
        double deer1 = Double.parseDouble(scanner.nextLine());
        double deer2 = Double.parseDouble(scanner.nextLine());
        double deer3 = Double.parseDouble(scanner.nextLine());

        double foodEaten = (days * deer1) + (days * deer2) + (days * deer3);

        if (foodKG >= foodEaten) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKG - foodEaten));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodEaten - foodKG));
        }


    }
}
