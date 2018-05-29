package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        word = word.substring(0, word.length() - 1) + "ies";

        System.out.println(word);
    }
}
