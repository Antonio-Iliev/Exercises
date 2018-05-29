package com.company;

import java.util.Scanner;

public class P09_CountTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                break;
            }
            count++;

        }

        System.out.println(count);
    }
}
