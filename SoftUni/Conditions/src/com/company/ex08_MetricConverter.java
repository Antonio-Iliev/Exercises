package com.company;

import java.util.Scanner;

public class ex08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();

        int mm = 1000;
        int cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        double conversion = 0.0;
        double result = 0.0;


        if (from.equals("mm")) {
            conversion = amount / mm;
        } else if (from.equals("cm")) {
            conversion = amount / cm;
        } else if (from.equals("mi")) {
            conversion = amount / mi;
        } else if (from.equals("in")) {
            conversion = amount / in;
        } else if (from.equals("km")) {
            conversion = amount / km;
        } else if (from.equals("ft")) {
            conversion = amount / ft;
        } else if (from.equals("yd")) {
            conversion = amount / yd;
        } else {
            conversion = amount;
        }

        if (to.equals("mm")) {
            result = conversion * mm;
        } else if (to.equals("cm")) {
            result = conversion * cm;
        } else if (to.equals("mi")) {
            result = conversion * mi;
        } else if (to.equals("in")) {
            result = conversion * in;
        } else if (to.equals("km")) {
            result = conversion * km;
        } else if (to.equals("ft")) {
            result = conversion * ft;
        } else if (to.equals("yd")) {
            result = conversion * yd;
        } else {
            result = conversion;
        }


        System.out.printf("%.8f", result);

    }
}
