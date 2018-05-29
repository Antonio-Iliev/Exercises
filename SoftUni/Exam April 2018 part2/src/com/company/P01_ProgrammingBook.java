package com.company;

import java.util.Scanner;

public class P01_ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOnePage = Double.parseDouble(scanner.nextLine());
        double priceKorica = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double designer = Double.parseDouble(scanner.nextLine());
        double discountGroup = Double.parseDouble(scanner.nextLine());


        double bookPrice = (priceOnePage * 899) + (priceKorica * 2);

        discount = (100 - discount) / 100;

        bookPrice *= discount;
        bookPrice += designer;

        discountGroup = (100 - discountGroup) / 100;

        bookPrice *= discountGroup;


        System.out.printf("Avtonom should pay %.2f BGN.", bookPrice);

    }
}
