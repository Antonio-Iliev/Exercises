package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int desNum = inputNumber / 10;
        int ediNum = inputNumber - (desNum * 10);

        String desName = "";
        String ediName = "";

        String dveteDumi = "";

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

        dveteDumi = desName + " " + ediName;

        System.out.println(dveteDumi.trim() + "!");
    }
}
