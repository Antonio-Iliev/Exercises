package com.company;

import java.util.Scanner;

public class P06_BitcoinCodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int maxCombinationNumb = Integer.parseInt(scanner.nextLine());

        int count = 0;

        char m = 33;
        char n = 58;


        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {

                if (maxCombinationNumb == count) {
                    return;
                }

                System.out.printf("%c%c%d%d%c%c|", m, n, i, j, n, m);

                m++;
                if (m > 47) {
                    m = 33;
                }

                n++;
                if (n > 64) {
                    n = 58;
                }

                count++;

            }

        }

    }
}
