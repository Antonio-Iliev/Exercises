package com.company;

import java.util.Scanner;

public class P14_MagicLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char invalidChar = scanner.nextLine().charAt(0);

        for (char i = firstChar; i <= secondChar; i++) {
            for (char j = firstChar; j <= secondChar; j++) {
                for (char k = firstChar; k <= secondChar; k++) {
                    if (i != invalidChar && j != invalidChar && k != invalidChar) {
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }


    }
}
