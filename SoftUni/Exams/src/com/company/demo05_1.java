package com.company;

import java.util.Scanner;

public class demo05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hHole = Integer.parseInt(scanner.nextLine());
        int wHole = Integer.parseInt(scanner.nextLine());
        int squarePicture = Integer.parseInt(scanner.nextLine());
        int numberPicture = Integer.parseInt(scanner.nextLine());


        int holeArea = hHole * wHole;
        int picturesArea = (squarePicture * squarePicture) * numberPicture;


        if (holeArea > picturesArea) {
            int diff = holeArea - picturesArea;
            System.out.printf("The pictures fit in the hole. " +
                    "Hole area is %d bigger than pictures area.", diff);
        } else if (holeArea < picturesArea) {
            int diff = picturesArea - holeArea;
            System.out.printf("The pictures don't fit in the hole. "
                    + "Picture area is %d bigger than hole area.", diff
            );
        }

    }
}
