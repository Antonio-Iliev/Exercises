package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P08_CenterPoint {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;


        try {
            x1 = Integer.parseInt(reader.readLine());
            y1 = Integer.parseInt(reader.readLine());
            x2 = Integer.parseInt(reader.readLine());
            y2 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }

        System.out.println(ClosestPointCenter(x1, y1, x2, y2));

    }

    static String ClosestPointCenter(int pointX1, int pointY1, int pointX2, int pointY2) {

        int point1 = Math.abs(pointX1);
        int point2 = Math.abs(pointY1);
        int point3 = Math.abs(pointX2);
        int point4 = Math.abs(pointY2);

        String pointsToReturn = "";

        if (point1 <= point3 && point2 <= point4) {
            pointsToReturn = "(" + pointX1 + ", " + pointY1 + ")";
        } else {
            pointsToReturn = "(" + pointX2 + ", " + pointY2 + ")";
        }

        return pointsToReturn;
    }
}
