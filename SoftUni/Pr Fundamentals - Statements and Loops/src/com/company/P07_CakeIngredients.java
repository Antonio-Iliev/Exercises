package com.company;

import java.util.Scanner;

public class P07_CakeIngredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputIngr = "";
        int count = 0;
        while (true) {
            inputIngr = scanner.nextLine();
            if (!inputIngr.equals("Bake!")) {
                count++;
                System.out.println("Adding ingredient "
                        + inputIngr
                        + ".");
            } else {
                break;
            }
        }

        System.out.println("Preparing cake with "
                + count
                + " ingredients.");
    }
}
