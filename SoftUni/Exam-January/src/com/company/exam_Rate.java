package com.company;

import java.util.Scanner;

public class exam_Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double simpleInterest = money;
        double complexInterest = money;

        for (int i = 0; i < months; i++) {
            simpleInterest += money * 0.03;
        }

        for (int i = 0; i < months; i++) {
            complexInterest *= 1.027;
        }

        if (simpleInterest > complexInterest) {
            System.out.printf("Simple interest rate: %.2f lv.\n" +
                            "Complex interest rate: %.2f lv.\n" +
                            "Choose a simple interest rate. You will win %.2f lv.\n",
                    simpleInterest, complexInterest, (simpleInterest - complexInterest));
        } else if (complexInterest > simpleInterest) {
            System.out.printf("Simple interest rate: %.2f lv. \n" +
                            "Complex interest rate: %.2f lv.\n" +
                            "Choose a complex interest rate. You will win %.2f lv.\n",
                    simpleInterest, complexInterest, (complexInterest - simpleInterest));
        }

        System.out.println();


    }
}
