package com.company;

import java.util.Scanner;

public class E08_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = side * h / 2.0;

        System.out.printf("Triangle area = %.2f", area);
    }
}
