package com.company;

import java.util.Scanner;

public class ex16_NumberToText100_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int desNum = inputNumber / 10;
        int ediNum = inputNumber - (desNum * 10);

        String desName = "";
        String ediName = "";
        String desIedinOut = "";

        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";

        String twenty = "twenty";
        String thirty = "thirty";
        String forty = "forty";
        String fifty = "fifty";
        String sixty = "sixty";
        String seventy = "seventy";
        String eighty = "eighty";
        String ninety = "ninety";

        // proverka za deseticite
        if (desNum < 3) {
            desName = twenty;
        } else if (desNum < 4) {
            desName = thirty;
        } else if (desNum < 5) {
            desName = forty;
        } else if (desNum < 6) {
            desName = fifty;
        } else if (desNum < 7) {
            desName = sixty;
        } else if (desNum < 8) {
            desName = seventy;
        } else if (desNum < 9) {
            desName = eighty;
        } else if (desNum < 10) {
            desName = ninety;
        } else {
            desName = "";
        }

        //proverka za edinicite
        if (ediNum == 1) {
            ediName = one;
        } else if (ediNum == 2) {
            ediName = two;
        } else if (ediNum == 3) {
            ediName = three;
        } else if (ediNum == 4) {
            ediName = four;
        } else if (ediNum == 5) {
            ediName = five;
        } else if (ediNum == 6) {
            ediName = six;
        } else if (ediNum == 7) {
            ediName = seven;
        } else if (ediNum == 8) {
            ediName = eight;
        } else if (ediNum == 9) {
            ediName = nine;
        } else {
            ediName = "";
        }

        desIedinOut = desName + " " + ediName;

        // proverka s otpechatvane
        if (inputNumber < 0) {
            System.out.println("invalid number");
        } else if (inputNumber == 0) {
            System.out.println("zero");
        } else if (inputNumber < 10) {
            System.out.println(ediName);
        } else if (inputNumber == 10) {
            System.out.println("ten");
        } else if (inputNumber == 11) {
            System.out.println("eleven");
        } else if (inputNumber == 12) {
            System.out.println("twelve");
        } else if (inputNumber == 13) {
            System.out.println("thirteen");
        } else if (inputNumber == 14) {
            System.out.println("fourteen");
        } else if (inputNumber == 15) {
            System.out.println("fifteen");
        } else if (inputNumber == 16) {
            System.out.println("sixteen");
        } else if (inputNumber == 17) {
            System.out.println("seventeen");
        } else if (inputNumber == 18) {
            System.out.println("eighteen");
        } else if (inputNumber == 19) {
            System.out.println("nineteen");
        } else if (inputNumber < 100) {
            System.out.println(desIedinOut.trim());
        } else if (inputNumber == 100) {
            System.out.println("one hundred");
        } else {
            System.out.println("invalid number");
        }
    }
}