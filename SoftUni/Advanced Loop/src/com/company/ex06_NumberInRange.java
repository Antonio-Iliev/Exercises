package com.company;

import java.util.Scanner;

public class ex06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Еnter a number in the range [1...100]:");

        while (number < 1 || number > 100) {
            System.out.printf("Invalid number!%nЕnter a number in the range [1...100]:");
            number = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", number);

    }
}
