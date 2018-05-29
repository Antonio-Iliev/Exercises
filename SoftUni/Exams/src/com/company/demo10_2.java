package com.company;

import java.util.Scanner;

public class demo10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numberSum = 0;
        String numberString = "";
        int sumAZ = 0;
        String strAZ = "";
        int azSUM = 0;
        String azString = "";
        int otherSum = 0;
        String otherString = "";


        if (n >= 1 && n <= 19) {

            for (int i = 0; i < n; i++) {
                int temp = (int) scanner.nextLine().charAt(0);

                if (temp >= 48 && temp <= 57) {
                    numberSum += temp;
                    numberString += Character.toString((char) temp);
                } else if (temp >= 65 && temp <= 90) {
                    sumAZ += temp;
                    strAZ += Character.toString((char) temp);
                } else if (temp >= 97 && temp <= 122) {
                    azSUM += temp;
                    azString += Character.toString((char) temp);
                } else if (temp >= 32 && temp <= 127) {
                    otherSum += temp;
                    otherString += Character.toString((char) temp);
                }
            }

            if (numberSum >= sumAZ
                    && numberSum >= azSUM
                    && numberSum >= otherSum
                    && numberSum != 0) {

                System.out.printf("Biggest ASCII sum is:%d%n" +
                        "Combination of characters is:%s", numberSum, numberString);

            } else if (sumAZ >= azSUM
                    && sumAZ >= otherSum
                    && sumAZ != 0) {

                System.out.printf("Biggest ASCII sum is:%d%n" +
                        "Combination of characters is:%s", sumAZ, strAZ);

            } else if (azSUM >= otherSum) {

                System.out.printf("Biggest ASCII sum is:%d%n" +
                        "Combination of characters is:%s", azSUM, azString);

            } else {

                System.out.printf("Biggest ASCII sum is:%d%n" +
                        "Combination of characters is:%s", otherSum, otherString);
            }

        }
    }
}
