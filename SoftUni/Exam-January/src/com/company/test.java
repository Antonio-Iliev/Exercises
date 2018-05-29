package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int juiceMax = Integer.parseInt(scanner.nextLine());

        int maxr = 0;
        int maxs = 0;
        int maxc = 0;
        double juiceTotal = 0;

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= s; j++) {
                for (int k = 0; k <= c; k++) {

                    double juiceCurrent = k * 15 + j * 7.5 + i * 4.5;

                    if (juiceCurrent <= juiceMax) {
                        if (juiceCurrent > juiceTotal) {
                            juiceTotal = juiceCurrent;

                            maxr = i;
                            maxs = j;
                            maxc = k;
                        }
                    }
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.", maxr, maxs, maxc,
                df.format(juiceTotal));
    }
}
