package com.company;

import java.util.Scanner;

public class P01_Choose_a_Drink_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (profession) {
            case "Athlete":
                price = quantity * 0.7;
                System.out.printf("The %s has to pay %.2f.", profession, price);
                break;
            case "Businessman":
            case "Businesswoman":
                price = quantity;
                System.out.printf("The %s has to pay %.2f.", profession, price);
                break;
            case "SoftUni Student":
                price = quantity * 1.7;
                System.out.printf("The %s has to pay %.2f.", profession, price);
                break;
            default:
                price = quantity * 1.2;
                System.out.printf("The %s has to pay %.2f.", profession, price);
                break;

        }
    }
}
