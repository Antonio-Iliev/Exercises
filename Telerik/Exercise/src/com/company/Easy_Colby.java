package com.company;

import java.util.Scanner;

public class Easy_Colby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numColby = scanner.nextInt();
        double amountMedicine = scanner.nextDouble();

        double space = 0.0;

        for (int i = 0; i < numColby; i++) {
            space += i;

            if ((i + 1) % 2 != 0 && space >= amountMedicine) {

                System.out.println(i + 1);
                return;
            }
        }
    }
}
