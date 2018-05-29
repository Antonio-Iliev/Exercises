package com.company;

import java.util.Scanner;

public class M1_P03_BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            int inputNumb = Integer.parseInt(scanner.nextLine());

            int numb1 = inputNumb / 100;
            int numb2 = (inputNumb % 100) / 10;
            int numb3 = inputNumb % 10;

            if (numb1 + numb3 != numb2) {
                System.out.println(sum);
                break;
            }

            sum += inputNumb;
        }
    }
}
