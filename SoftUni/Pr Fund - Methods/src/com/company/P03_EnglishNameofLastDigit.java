package com.company;

import java.util.Scanner;

public class P03_EnglishNameofLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(EnglishNameOfLastDigit(number));


    }

    static String EnglishNameOfLastDigit(int number) {
        number = number % 10;
        String lastDigitInText = "";

        switch (number) {
            case 1:
                lastDigitInText = "one";
                break;
            case 2:
                lastDigitInText = "two";
                break;
            case 3:
                lastDigitInText = "three";
                break;
            case 4:
                lastDigitInText = "four";
                break;
            case 5:
                lastDigitInText = "five";
                break;
            case 6:
                lastDigitInText = "six";
                break;
            case 7:
                lastDigitInText = "seven";
                break;
            case 8:
                lastDigitInText = "eight";
                break;
            case 9:
                lastDigitInText = "nine";
                break;
            case 0:
                lastDigitInText = "zero";
                break;
        }
        return lastDigitInText;
    }

}
