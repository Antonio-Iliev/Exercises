package com.company;

import java.util.Scanner;

public class demo4_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceAB = Double.parseDouble(scanner.nextLine());
        double truckSpeed = Double.parseDouble(scanner.nextLine());
        double difSpeed = Double.parseDouble(scanner.nextLine());


        double carSpeed = 0;

        if (difSpeed != 0) {
            carSpeed = difSpeed * 3.6;
        } else {
            carSpeed = truckSpeed;
        }

        double truckArriveTime = Math.ceil(distanceAB / truckSpeed);
        double carArriveTime = Math.ceil(distanceAB / carSpeed);


        System.out.printf("The truck arrived after %.0f hours%n", truckArriveTime);
        System.out.printf("The car arrived after %.0f hours", carArriveTime);


    }

}
