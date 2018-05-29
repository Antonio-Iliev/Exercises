package com.company;

import java.util.Scanner;

public class M2_P02_SpeedsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] myArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        int maxSpeedGroup = 0;
        int countCars = 1;
        int maxGroup = 1;

        int prevCar = myArray[0];
        int currentSum = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if (prevCar < myArray[i]) {
                countCars++;
                currentSum += myArray[i];
            } else {
                prevCar = myArray[i];
                countCars = 1;
                currentSum = myArray[i];
            }


            if (countCars > maxGroup) {
                maxGroup = countCars;
                maxSpeedGroup = currentSum;

            } else if (countCars == maxGroup) {
                maxSpeedGroup = Math.max(currentSum, maxSpeedGroup);
            }

        }

        System.out.println(maxSpeedGroup);
    }
}
