package com.company;

import java.util.Scanner;

public class ex12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double result = ((48 - h) * 3.0 / 4) + h + (p * 2.0 / 3);

        if (year.equals("leap")) {
            result = result * 1.15;
        }

        System.out.println(Math.floor(result));
    }
}
