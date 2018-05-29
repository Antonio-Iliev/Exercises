package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_LargestCommonEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray1 = reader.readLine().split(" ");
        String[] strArray2 = reader.readLine().split(" ");


        int countFromLeft = CheckLeftRight(strArray1, strArray2);
        int countFromRight = CheckRightLeft(strArray1, strArray2);

        if (countFromLeft >= countFromRight) {
            System.out.println(countFromLeft);
        } else {
            System.out.println(countFromRight);
        }

    }

    static int CheckLeftRight(String[] strToCompere1, String[] strToCompere2) {
        int count = 0;

        if (strToCompere1.length <= strToCompere2.length) {
            for (int i = 0; i < strToCompere1.length; i++) {
                if (strToCompere1[i].equals(strToCompere2[i])) {
                    count++;
                } else {
                    return count;
                }
            }
        } else {
            for (int i = 0; i < strToCompere2.length; i++) {
                if (strToCompere1[i].equals(strToCompere2[i])) {
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
    }

    static int CheckRightLeft(String[] strToCompere1, String[] strToCompere2) {
        int count = 0;
        int diffInLength = Math.abs(strToCompere1.length - strToCompere2.length);

        if (strToCompere1.length <= strToCompere2.length) {
            for (int i = strToCompere1.length - 1; i >= 0; i--) {
                if (strToCompere1[i].equals(strToCompere2[i + diffInLength])) {
                    count++;
                } else {
                    return count;
                }
            }
        } else {
            for (int i = strToCompere2.length - 1; i >= 0; i--) {
                if (strToCompere1[i + diffInLength].equals(strToCompere2[i])) {
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
    }
}

