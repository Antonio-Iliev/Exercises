package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class P08_CenterPoint_v2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;


        try {
            x1 = Double.parseDouble(reader.readLine());
            y1 = Double.parseDouble(reader.readLine());
            x2 = Double.parseDouble(reader.readLine());
            y2 = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }

        System.out.println(ClosestPointCenter(x1, y1, x2, y2));
    }

    static String ClosestPointCenter(double pointX1, double pointY1, double pointX2, double pointY2) {

        double distancePoint1 = Math.abs(Math.abs(pointX1) - Math.abs(pointY1));
        double distancePoint2 = Math.abs(Math.abs(pointX2) - Math.abs(pointY2));

        String pointsToReturn = "";
        NumberFormat formater = new DecimalFormat("#0.##");
        if (distancePoint1 <= distancePoint2) {
            pointsToReturn = "("
                    + formater.format(pointX1)
                    + ", "
                    + formater.format(pointY1)
                    + ")";
        } else {
            pointsToReturn = "("
                    + formater.format(pointX2)
                    + ", "
                    + formater.format(pointY2)
                    + ")";
        }

        return pointsToReturn;
    }
}
