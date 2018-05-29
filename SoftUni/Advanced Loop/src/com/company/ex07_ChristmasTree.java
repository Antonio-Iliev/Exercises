package com.company;

import java.util.Scanner;

public class ex07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n + 1; i++) {
            System.out.print(repeatString(" ", n - i));
            System.out.print(repeatString("*", i));
            System.out.print(" | ");
            System.out.println(repeatString("*", i));

        }

    }

    static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }


}
