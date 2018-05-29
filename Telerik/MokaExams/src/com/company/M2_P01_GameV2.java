package com.company;

import java.util.Scanner;

public class M2_P01_GameV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int numb1 = numbers / 100;
        int numb2 = (numbers % 100) / 10;
        int numb3 = numbers % 10;

        int sum1 = numb1 + numb2 + numb3;
        int sum2 = numb1 * numb2 * numb3;
        int sum3 = numb1 + numb2 * numb3;
        int sum4 = numb1 * numb2 + numb3;

        int maxSum = Math.max(Math.max(sum1, sum2), Math.max(sum3, sum4));

        System.out.println(maxSum);
    }
}
