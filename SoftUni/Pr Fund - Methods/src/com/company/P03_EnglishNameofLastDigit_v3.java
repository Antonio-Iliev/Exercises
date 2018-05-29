package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_EnglishNameofLastDigit_v3 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = "";

        try {
            numberString = reader.readLine();
        } catch (IOException e) {
            System.out.println("Exception");
        }

        int lastNub = StringToLastInteger(numberString);

        System.out.println(EnglishNameOfLastDigit(lastNub));


    }

    static String EnglishNameOfLastDigit(int numberInStr) {


        switch (numberInStr) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            default:
                return "";
        }

    }

    static int StringToLastInteger(String inputString) {

        for (int i = inputString.length() - 1; i >= 0; i--) {
            char ch = inputString.charAt(i);
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4'
                    || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                return (int) ch - '0';
            }

        }
        return 10;
    }

}
