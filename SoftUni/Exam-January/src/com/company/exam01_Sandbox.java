package com.company;

import java.util.Scanner;

public class exam01_Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aWidth = Double.parseDouble(scanner.nextLine());
        double bLength = Double.parseDouble(scanner.nextLine());
        double sandPrice = Double.parseDouble(scanner.nextLine());
        double plankPrice = Double.parseDouble(scanner.nextLine());

        double areaSand = (aWidth - 0.4) * (bLength - 0.4);
        double areaPlank = (aWidth * bLength) - areaSand;

        double amountSand = Math.ceil(areaSand * 20);
        double amountPlank = Math.ceil(areaPlank / 0.44);

        sandPrice *= amountSand;
        plankPrice *= amountPlank;


        System.out.printf("%.2f", sandPrice + plankPrice);


    }
}
