package com.company;

import java.util.Scanner;

public class P05_WordInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word.endsWith("y")) {
            String newWord = "";
            for (int i = 0; i < word.length() - 1; i++) {
                char addToString = word.charAt(i);
                newWord += addToString;
            }
            System.out.println(newWord + "ies");

        } else if (word.endsWith("o") || word.endsWith("ch") || word.endsWith("s")
                || word.endsWith("sh") || word.endsWith("x") || word.endsWith("z")) {
            System.out.println(word + "es");

        } else {
            System.out.println(word + "s");
        }
    }
}
