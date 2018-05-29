package com.company;

import java.util.Scanner;

public class ex05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow = "+";
        String middleOfmiddle = "";

        for (int i = 0; i < n - 2; i++) {
            middleOfmiddle += " -";
        }

        firstAndLastRow += middleOfmiddle + " +";

        System.out.println(firstAndLastRow);

        String middleRow = "|" + middleOfmiddle + " |";

        for (int i = 0; i < n - 2; i++) {
            System.out.println(middleRow);
        }

        System.out.println(firstAndLastRow);

    }
}
