package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10_CubeProperties {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double cubeSide = 0;
        String cubeParameter = "";

        try {
            cubeSide = Double.parseDouble(reader.readLine());
            cubeParameter = reader.readLine().toLowerCase();
        } catch (IOException e) {
            System.out.println("It isn't a number or text");
        }

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
