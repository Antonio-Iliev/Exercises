package com.company;

import java.util.Scanner;

public class ex13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int contNumber = 0;
        int count = 0;
        int intCount = 1;


        while (contNumber <= n) {

            while (count < intCount) {
                count++;
                contNumber++;
                System.out.print(contNumber + " ");

                if (contNumber == n) {
                    break;
                }


            }

            count = 0;
            intCount++;

            if (contNumber == n) {
                break;
            }

            System.out.println();

        }


    }
}
