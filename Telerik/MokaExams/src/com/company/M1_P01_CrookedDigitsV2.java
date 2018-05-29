package com.company;

import java.util.Scanner;

public class M1_P01_CrookedDigitsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                n += ch - '0';
            }

        }

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
            if (sum > 9) {
                sum = (sum / 10) + (sum % 10);
            }
        }

        System.out.println(sum);
    }
}
