package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_LongerLine {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] twoLinesCoordinate = new int[8];

        try {
            for (int i = 0; i < twoLinesCoordinate.length; i++) {
                twoLinesCoordinate[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }


        System.out.println(LongerLineBetweenTwoLine(twoLinesCoordinate));

    }

    static String LongerLineBetweenTwoLine(int[] corFromArray) {
        int aSideFromLine1 = corFromArray[2] - corFromArray[0];
        int bSideFromLine1 = corFromArray[3] - corFromArray[1];
        int aSideFromLine2 = corFromArray[6] - corFromArray[4];
        int bSideFromLine2 = corFromArray[7] - corFromArray[5];

        aSideFromLine1 *= aSideFromLine1;
        bSideFromLine1 *= bSideFromLine1;
        aSideFromLine2 *= aSideFromLine1;
        bSideFromLine2 *= bSideFromLine1;

        double lengthLine1 = Math.sqrt(aSideFromLine1 + bSideFromLine1);
        double lengthLine2 = Math.sqrt(aSideFromLine2 + bSideFromLine2);

        String longestLine = "";
        String firstPoint = "(" + corFromArray[0] + ", " + corFromArray[1] + ")";
        String secondPoint = "(" + corFromArray[2] + ", " + corFromArray[3] + ")";
        String thirdPoint = "(" + corFromArray[4] + ", " + corFromArray[5] + ")";
        String fourthPoint = "(" + corFromArray[6] + ", " + corFromArray[7] + ")";

        if (lengthLine1 >= lengthLine2) {
            if (Math.abs(corFromArray[0]) <= Math.abs(corFromArray[2])
                    && Math.abs(corFromArray[1]) <= Math.abs(corFromArray[3])) {
                longestLine = firstPoint + secondPoint;
            } else {
                longestLine = secondPoint + firstPoint;
            }
        } else {
            if (Math.abs(corFromArray[4]) <= Math.abs(corFromArray[6])
                    && Math.abs(corFromArray[5]) <= Math.abs(corFromArray[7])) {
                longestLine = thirdPoint + fourthPoint;
            } else {
                longestLine = fourthPoint + thirdPoint;
            }
        }

        return longestLine;
    }
}
