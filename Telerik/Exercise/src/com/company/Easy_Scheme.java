package com.company;

import java.util.Scanner;

public class Easy_Scheme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        String material = scanner.nextLine().replaceAll(" ", "");

        int length = Math.max(side1, side2);
        int height = Math.min(side1, side2);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(material);
            }
            System.out.println();
        }

    }
}
