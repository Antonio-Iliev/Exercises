package com.company;

import java.util.Scanner;

public class P13_GameOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int firstNum = 0;
        int secondNum = 0;
        int counter = 0;
        for (int i = n; i <= m; i++) {
            for (int j = n; j <= m; j++) {
                counter++;
                if ((i + j) == magicNumber) {
                    firstNum = i;
                    secondNum = j;
                }
            }

        }
        if (firstNum != 0 && secondNum != 0) {
            System.out.printf("Number found! %d + %d = %d", firstNum, secondNum, magicNumber);
        } else if (firstNum == 0 && secondNum == 0) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
