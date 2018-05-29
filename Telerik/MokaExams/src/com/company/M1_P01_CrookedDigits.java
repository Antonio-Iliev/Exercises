package com.company;

import java.util.Scanner;

public class M1_P01_CrookedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        if (n < 0) {
            n *= -1;
        }

        if (n < 10 && n >= 0) {
            System.out.printf("%.0f", n);
        }

        int checkNumb = (int) n * 1000;

        int sum = 0;
        while (checkNumb > 0) {
            sum += checkNumb % 10;
            checkNumb /= 10;
            if (sum > 9) {
                sum = (sum / 10) + (sum % 10);
            }
        }


        System.out.println(sum);

    }
}
