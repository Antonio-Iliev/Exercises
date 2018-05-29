package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exam06_JuiceDiet_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raspberryNumb = Integer.parseInt(scanner.nextLine());
        int strawberryNumb = Integer.parseInt(scanner.nextLine());
        int cheryNumb = Integer.parseInt(scanner.nextLine());
        int restriction = Integer.parseInt(scanner.nextLine());

        int countChery = 0;
        int countStraw = 0;
        int countRasp = 0;
        double juice = 0;

        for (int i = 0; i <= raspberryNumb; i++) {
            for (int j = 0; j <= strawberryNumb; j++) {
                for (int k = 0; k <= cheryNumb; k++) {
                    double madeJuice = i * 4.5 + j * 7.5 + k * 15;
                    if (madeJuice <= restriction && juice < madeJuice) {
                        juice = madeJuice;
                        countChery = k;
                        countStraw = j;
                        countRasp = i;
                    }
                }

            }

        }

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.",
                countRasp, countStraw, countChery, df.format(juice));

    }

}
