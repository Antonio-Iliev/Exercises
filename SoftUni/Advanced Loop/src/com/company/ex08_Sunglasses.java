package com.company;

import java.util.Scanner;

public class ex08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstLast = repeatString("*", n * 2);
        String middle = repeatString("/", (n * 2) - 2);
        String interval = repeatString(" ", n);
        String ramka = repeatString("|", n);

        System.out.println(firstLast + interval + firstLast);

        for (int i = 0; i < n - 2; i++) {
            if ((n - 1) / 2 - 1 == i) {
                System.out.println("*" + middle + "*" + ramka + "*" + middle + "*");
            } else {
                System.out.println("*" + middle + "*" + interval + "*" + middle + "*");
            }
        }

        System.out.println(firstLast + interval + firstLast);

    }

    static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
