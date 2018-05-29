package com.company;

import java.util.Scanner;

public class ex08_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        double percentage = 0;

        boolean mark1 = s >= 0 && s <= 500;
        boolean mark2 = s > 500 && s <= 1000;
        boolean mark3 = s > 1000 && s <= 10000;
        boolean mark4 = s > 10000;

        switch (city) {
            case "Sofia":
                if (mark1) {
                    percentage = .05;
                } else if (mark2) {
                    percentage = .07;
                } else if (mark3) {
                    percentage = .08;
                } else if (mark4) {
                    percentage = .12;
                }
                break;
            case "Varna":
                if (mark1) {
                    percentage = .045;
                } else if (mark2) {
                    percentage = .075;
                } else if (mark3) {
                    percentage = .1;
                } else if (mark4) {
                    percentage = .13;
                }
                break;
            case "Plovdiv":
                if (mark1) {
                    percentage = .055;
                } else if (mark2) {
                    percentage = .08;
                } else if (mark3) {
                    percentage = .12;
                } else if (mark4) {
                    percentage = .145;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        double result = s * percentage;

        if (percentage != 0) {
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }

    }
}
