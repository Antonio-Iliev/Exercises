package com.company;

import java.util.Scanner;

public class MostFrequentV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        int count = 0;
        int position = 0;
        int maxLength = 0;

        for (int i = 0; i < myArray.length - 1; i++) {
            count = 0;

            for (int j = 0; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]){
                    count++;
                }
                if (count > maxLength){
                    maxLength = count;
                    position = myArray[j];
                }

            }

        }

        System.out.printf("%d (%d times)", position, maxLength);
    }
}
