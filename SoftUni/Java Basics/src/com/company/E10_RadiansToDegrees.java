package com.company;

import java.util.Scanner;

public class E10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());

        double deg = Math.round(rad * 180 / Math.PI);

        System.out.printf("%.0f%n", deg);

        /// degrees = radians*180/Math.PI;
    }
}
