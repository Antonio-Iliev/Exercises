package com.company;

import java.util.Scanner;

public class ex11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid number!");
        }

        while (number % 2 != 0) {
            try {
                System.out.println("The number is not even.");
                number = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }

        if (number != 0) {
            System.out.println("Even number entered: " + number);
        }

    }
}
