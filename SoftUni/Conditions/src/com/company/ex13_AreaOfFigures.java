package com.company;

import java.util.Scanner;

public class ex13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figures = scanner.nextLine();
        double side1 = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (figures.equals("square")) {
            result = side1 * side1;
        } else if (figures.equals("rectangle")) {
            double side2 = Double.parseDouble(scanner.nextLine());
            result = side1 * side2;
        } else if (figures.equals("circle")) {
            result = Math.PI * side1 * side1;
        } else if (figures.equals("triangle")) {
            double side2 = Double.parseDouble(scanner.nextLine());
            result = side1 * side2 / 2;
        }

        System.out.printf("%.3f", result);

    }
}
