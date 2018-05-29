package com.company;

import java.util.Scanner;

public class P02_Poll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberCounts = Integer.parseInt(scanner.nextLine());
        double numbFirstLang = Integer.parseInt(scanner.nextLine());

        double numbSecondLang = numbFirstLang * 0.8;
        double numbThirdLang = numbSecondLang * 0.9;

        double sumOfThree = numbFirstLang + numbSecondLang + numbThirdLang;
        double halfCounter = numberCounts / 2;

        if (halfCounter <= sumOfThree) {
            System.out.printf("First three languages have %.0f votes more",
                    sumOfThree - halfCounter);
        } else {
            System.out.printf("First three languages have %.0f votes less of half votes",
                    halfCounter - sumOfThree);
        }

    }
}
