package com.company;

import java.util.Scanner;

public class M2_P01_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int numb1 = numbers / 100;
        int numb2 = (numbers % 100) / 10;
        int numb3 = numbers % 10;

        int maxSum = 0;

        int currentSum = numb1 + numb2 + numb3;
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        currentSum = numb1 * numb2 * numb3;
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        currentSum = numb1 * numb2 + numb3;
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        currentSum = numb2 * numb3 + numb1;
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        currentSum = numb3 * numb1 + numb2;
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        System.out.println(maxSum);
    }
}
