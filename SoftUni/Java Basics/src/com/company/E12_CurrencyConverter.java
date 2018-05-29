package com.company;

import java.util.Scanner;

public class E12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String c1IN = scanner.nextLine();
        String c2IN = scanner.nextLine();
        double result;

        if (c1IN.equals("BGN") && c2IN.equals("USD")) {
            result = amount / 1.79549;

        } else if (c1IN.equals("BGN") && c2IN.equals("EUR")) {
            result = amount / 1.95583;

        } else if (c1IN.equals("BGN") && c2IN.equals("GBP")) {
            result = amount / 2.53405;

        } else if (c1IN.equals("USD") && c2IN.equals("BGN")) {
            result = amount * 1.79549;

        } else if (c1IN.equals("USD") && c2IN.equals("EUR")) {
            result = amount * (1.79549 / 1.95583);

        } else if (c1IN.equals("USD") && c2IN.equals("GBP")) {
            result = amount * (1.79549 / 2.53405);

        } else if (c1IN.equals("EUR") && c2IN.equals("BGN")) {
            result = amount * 1.95583;

        } else if (c1IN.equals("EUR") && c2IN.equals("USD")) {
            result = amount * (1.95583 / 1.79549);

        } else if (c1IN.equals("EUR") && c2IN.equals("GBP")) {
            result = amount * (1.95583 / 2.53405);

        } else if (c1IN.equals("GBP") && c2IN.equals("BGN")) {
            result = amount * 2.53405;

        } else if (c1IN.equals("GBP") && c2IN.equals("USD")) {
            result = amount * (2.53405 / 1.79549);

        } else if (c1IN.equals("GBP") && c2IN.equals("EUR")) {
            result = amount * (2.53405 / 1.95583);

        } else {
            result = 0;
        }

        System.out.printf("%.2f %s", result, c2IN);

    }
}
