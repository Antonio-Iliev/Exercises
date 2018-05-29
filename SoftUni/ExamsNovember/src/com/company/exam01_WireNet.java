package com.company;

import java.util.Scanner;

public class exam01_WireNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());


        int perimeter = (length + width) * 2;
        price *= perimeter;
        double areaWall = perimeter * height;
        weight *= areaWall;


        System.out.printf("%d%n"
                        + "%.2f%n"
                        + "%.3f%n",
                perimeter, price, weight
        );


    }
}

