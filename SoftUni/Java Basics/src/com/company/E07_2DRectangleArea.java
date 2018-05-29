package com.company;

import java.util.Scanner;

public class E07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double length = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);

        double area = length * height;
        double perimeter = (length + height) * 2;

        System.out.printf("%f%n%f", area, perimeter);
        // System.out.printf("%nlength %f, height %f, area %f, perimeter %f", length, height, area, perimeter);
    }
}