package com.company;

import java.util.Scanner;

public class P03_OnlineEducation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage1 = scanner.nextLine().toLowerCase();
        int nubStudStage1 = Integer.parseInt(scanner.nextLine());
        String stage2 = scanner.nextLine().toLowerCase();
        int nubStudStage2 = Integer.parseInt(scanner.nextLine());
        String stage3 = scanner.nextLine().toLowerCase();
        int nubStudStage3 = Integer.parseInt(scanner.nextLine());


        int sumOnline = 0;
        int sumOnsite = 0;
        int totalSum = 0;

        switch (stage1) {
            case "online":
                sumOnline += nubStudStage1;
                break;
            case "onsite":
                sumOnsite += nubStudStage1;
                break;
        }

        switch (stage2) {
            case "online":
                sumOnline += nubStudStage2;
                break;
            case "onsite":
                sumOnsite += nubStudStage2;
                break;
        }

        switch (stage3) {
            case "online":
                sumOnline += nubStudStage3;
                break;
            case "onsite":
                sumOnsite += nubStudStage3;
                break;
        }

        if (sumOnsite > 600) {
            sumOnline += sumOnsite - 600;
            sumOnsite = 600;
        }


        totalSum = sumOnline + sumOnsite;

        System.out.printf("Online students: %d\n" +
                        "Onsite students: %d\n" +
                        "Total students: %d",
                sumOnline, sumOnsite, totalSum);

    }
}
