package com.company;

import java.util.Scanner;

public class E04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pesho1 = Integer.parseInt(scanner.nextLine()); //10
        int pesho2 = Integer.parseInt(scanner.nextLine()); //10

        if (pesho1 > pesho2) {
            System.out.println(pesho1);
        } else {
            System.out.println(pesho2);
        }


    }
}
