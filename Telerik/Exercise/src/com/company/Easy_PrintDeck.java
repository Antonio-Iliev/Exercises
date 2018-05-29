package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_PrintDeck {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().toUpperCase();

        switch (input) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                From2to10(input);
                break;
            case "J":
            case "Q":
            case "K":
            case "A":
                From2to10("10");
                FromJtoA(input);
                break;
        }

    }

    static void From2to10(String number) {
        int n = Integer.parseInt(number);
        if (n >= 2 && n <= 10) {
            for (int i = 2; i <= n; i++) {
                System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds\n",
                        i, i, i, i);
            }
        }
    }

    static void FromJtoA(String strCards) {
        String cards = "JQKA";

        for (int i = 0; i < 4; i++) {
            System.out.printf("%c of spades, %c of clubs, %c of hearts, %c of diamonds\n"
                    , cards.charAt(i), cards.charAt(i), cards.charAt(i), cards.charAt(i));

            if (strCards.charAt(0) == cards.charAt(i)) {
                return;
            }
        }

    }
}
