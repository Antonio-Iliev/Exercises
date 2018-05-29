package com.company;

import java.util.Scanner;

public class exam06_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine()) * 100;
        int counter = 0;


        while (n != 0) {
            if (n >= 200) {
                n -= 200;
                counter++;
            } else if (n >= 100) {
                n -= 100;
                counter++;
            } else if (n >= 50) {
                n -= 50;
                counter++;
            } else if (n >= 20) {
                n -= 20;
                counter++;
            } else if (n >= 10) {
                n -= 10;
                counter++;
            } else if (n >= 5) {
                n -= 5;
                counter++;
            } else if (n >= 2) {
                n -= 2;
                counter++;
            } else if (n >= 1) {
                n -= 1;
                counter++;
            }

        }

        System.out.println(counter);
    }
}
