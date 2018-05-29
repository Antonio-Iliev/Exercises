package com.company;

import java.util.Scanner;

public class P10_CubeProperties_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cubeSide = Double.parseDouble(scanner.nextLine());
        String cubeParameter = scanner.nextLine().toLowerCase();

        switch (cubeParameter) {
            case "face":
                System.out.printf("%.2f", CubeFace(cubeSide));
                break;
            case "space":
                System.out.printf("%.2f", CubeSpace(cubeSide));
                break;
            case "volume":
                System.out.printf("%.2f", CubeVolume(cubeSide));
                break;
            case "area":
                System.out.printf("%.2f", CubeArea(cubeSide));
                break;
        }
    }

    static double CubeFace(double side) {
        return Math.sqrt(Math.pow(side, 2) + Math.pow(side, 2));
    }

    static double CubeSpace(double side) {
        double diagonalLength = 0;

        for (int i = 0; i < 3; i++) {
            diagonalLength += Math.pow(side, 2);
        }
        diagonalLength = Math.sqrt(diagonalLength);

        return diagonalLength;
    }

    static double CubeVolume(double side) {
        return Math.pow(side, 3);
    }

    static double CubeArea(double side) {
        double area = 0;

        for (int i = 0; i < 6; i++) {
            area += Math.pow(side, 2);
        }

        return area;
    }
}
