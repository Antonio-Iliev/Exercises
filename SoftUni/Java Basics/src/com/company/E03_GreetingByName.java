package com.company;

import java.util.Scanner;

public class E03_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}