package com.company;

import java.util.Scanner;

public class exma01_IvanovisFamily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double price01 = Double.parseDouble(scanner.nextLine());
        double price02 = Double.parseDouble(scanner.nextLine());
        double price03 = Double.parseDouble(scanner.nextLine());

        double allGifts = price01 + price02 + price03;
        double donations = (budget - allGifts) * 0.9;

        System.out.printf("%.2f", donations);


    }
}
