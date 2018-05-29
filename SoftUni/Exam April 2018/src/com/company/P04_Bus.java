package com.company;

import java.util.Scanner;

public class P04_Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passenNumb = Integer.parseInt(scanner.nextLine());
        int stops = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= stops; i++) {
            int outPassen = Integer.parseInt(scanner.nextLine());
            int inPassen = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                passenNumb = (passenNumb - outPassen) + inPassen + 2;
            } else {
                passenNumb = (passenNumb - outPassen - 2) + inPassen;
            }
        }

        System.out.println("The final number of passengers is : " + passenNumb);

    }
}
