package com.company;

import java.util.Scanner;

public class P02_Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsNub = Integer.parseInt(scanner.nextLine());
        int dancerNub = Integer.parseInt(scanner.nextLine());
        int daysNub = Integer.parseInt(scanner.nextLine());

        double stepsPerDay = 100.0 * stepsNub / daysNub;
        stepsPerDay /= stepsNub;
        stepsPerDay = Math.ceil(stepsPerDay);

        if (stepsPerDay <= 13 && stepsPerDay > 0) {
            double result = stepsPerDay / dancerNub;
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", result);
        } else if (stepsPerDay > 13) {
            double result = stepsPerDay / dancerNub;
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", result);
        }
    }
}