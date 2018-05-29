package com.company;

import java.util.Scanner;

public class P11_5DifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = a; k <= b; k++) {
                    for (int l = a; l <= b; l++) {
                        for (int m = a; m <= b; m++) {
                            if (a <= i && i < j && j < k && k < l && l < m && m <= b) {
                                System.out.printf("%d %d %d %d %d\n", i, j, k, l, m);
                                count++;
                            }
                        }

                    }

                }

            }

        }

        if (count == 0) {
            System.out.println("No");
        }

    }
}
