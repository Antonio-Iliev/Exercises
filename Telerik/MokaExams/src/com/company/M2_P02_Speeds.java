package com.company;

import java.util.Scanner;

public class M2_P02_Speeds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        int maxSpeedGroup = 0;
        int countCars = 1;
        int maxGroup = 0;

        int carSpeed = Integer.parseInt(scanner.nextLine());
        int prevCar = carSpeed;
        int currentSum = carSpeed;

        for (int i = 0; i < numberOfCars - 1; i++) {

            if (prevCar < carSpeed) {
                countCars++;
                currentSum += carSpeed;
            } else {
                prevCar = carSpeed;
                countCars = 1;
                currentSum = carSpeed;
            }

            if (countCars >= maxGroup) {

                if (currentSum > maxSpeedGroup || countCars >= maxGroup) {
                    maxSpeedGroup = currentSum;
                }
                maxGroup = countCars;
            }

            carSpeed = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(maxSpeedGroup);
    }
}
