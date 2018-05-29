package com.company;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String pozdrav = "Hello " + name;

        System.out.println(pozdrav);
    }
}
