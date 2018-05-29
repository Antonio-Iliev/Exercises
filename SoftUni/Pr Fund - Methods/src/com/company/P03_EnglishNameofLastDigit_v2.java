package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P03_EnglishNameofLastDigit_v2 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = "";

        try {
            numberString = reader.readLine();
        } catch (IOException e) {
            System.out.println("Not a number");
        }

        System.out.println(EnglishNameOfLastDigit(numberString));
    }

    static String EnglishNameOfLastDigit(String numberInStr) {
        int number = Integer.parseInt(numberInStr) % 10;
        String lastDigitInText = "";

        switch (number) {
            case 1:
                lastDigitInText = "one";
                return lastDigitInText;
            case 2:
                lastDigitInText = "two";
                return lastDigitInText;
            case 3:
                lastDigitInText = "three";
                return lastDigitInText;
            case 4:
                lastDigitInText = "four";
                return lastDigitInText;
            case 5:
                lastDigitInText = "five";
                return lastDigitInText;
            case 6:
                lastDigitInText = "six";
                return lastDigitInText;
            case 7:
                lastDigitInText = "seven";
                return lastDigitInText;
            case 8:
                lastDigitInText = "eight";
                return lastDigitInText;
            case 9:
                lastDigitInText = "nine";
                return lastDigitInText;
            case 0:
                lastDigitInText = "zero";
                return lastDigitInText;
            default:
                return lastDigitInText;
        }

    }

}
