package com.company;

import java.util.Scanner;

public class P06_SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String finalN = "" + input.charAt(input.length() - 1);

        int n = Integer.parseInt(input);


        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int multip = a * b * c * d;

                        if (sum == multip && finalN.equals("5")) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            return;
                        }

                        if (multip / sum == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            return;
                        }


                    }
                }
            }
        }

        System.out.println("Nothing found");

    }
}
