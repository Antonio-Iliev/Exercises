package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class P09_LongerLine_v2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] twoLinesCoordinate = new double[8];

        try {
            for (int i = 0; i < twoLinesCoordinate.length; i++) {
                twoLinesCoordinate[i] = Double.parseDouble(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }

        System.out.println(LongerLineBetweenTwoLine(twoLinesCoordinate));

    }

    static String LongerLineBetweenTwoLine(double[] corFromArray) {
        double aSideFromLine1 = Math.pow(corFromArray[2] - corFromArray[0], 2);
        double bSideFromLine1 = Math.pow(corFromArray[3] - corFromArray[1], 2);
        double aSideFromLine2 = Math.pow(corFromArray[6] - corFromArray[4], 2);
        double bSideFromLine2 = Math.pow(corFromArray[7] - corFromArray[5], 2);

        double lengthLine1 = Math.sqrt(aSideFromLine1 + bSideFromLine1);
        double lengthLine2 = Math.sqrt(aSideFromLine2 + bSideFromLine2);

        if (lengthLine1 >= lengthLine2) {
            return CloserPointToCenter(
                    corFromArray[0], corFromArray[1],
                    corFromArray[2], corFromArray[3]
            );
        } else {
            return CloserPointToCenter(
                    corFromArray[4], corFromArray[5],
                    corFromArray[6], corFromArray[7]
            );
        }

    }

    static String CloserPointToCenter(double x1, double y1, double x2, double y2) {
        double distanceToCenter1 = Math.abs(x2 - x1);
        double distanceToCenter2 = Math.abs(y2 - y1);

        String closestPointFirst = "";

        NumberFormat numForm = new DecimalFormat("#0.#####");

        if (distanceToCenter1 <= distanceToCenter2) {
            closestPointFirst += "(" + numForm.format(x1) + ", " + numForm.format(y1) + ")";

            closestPointFirst += "(" + numForm.format(x2) + ", " + numForm.format(y2) + ")";

            return closestPointFirst;
        } else {
            closestPointFirst += "(" + numForm.format(x2) + ", " + numForm.format(y2) + ")";
            closestPointFirst += "(" + numForm.format(x1) + ", " + numForm.format(y1) + ")";

            return closestPointFirst;
        }
    }
}
