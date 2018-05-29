package com.company;

import java.util.Scanner;

public class P04_Autonomy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int areaApartment = width * length * height;

        int areaBoxes = 0;

        while (true) {
            String numberBoxAndStop = scanner.nextLine();

            if (numberBoxAndStop.equals("Done")) {
                System.out.printf("%d Cubic meters left.", areaApartment - areaBoxes);
                return;
            }

            areaBoxes += Integer.parseInt(numberBoxAndStop);

            if (areaApartment < areaBoxes) {
                System.out.printf("No more free space!" +
                        " You need %d Cubic meters more.", areaBoxes - areaApartment);
                return;
            }
        }
    }
}
