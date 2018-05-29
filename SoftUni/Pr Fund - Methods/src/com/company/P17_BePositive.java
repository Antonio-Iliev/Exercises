package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class P17_BePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String inputNumInText = scanner.nextLine().trim();
            String outputPositiveNum = BePositive(FromStringToList(inputNumInText));

            if (outputPositiveNum.length() > 0) {
                System.out.println(outputPositiveNum);
            } else {
                System.out.println("(empty)");
            }
        }


    }

    static ArrayList<Integer> FromStringToList(String strToConvert) {
        ArrayList<Integer> listOfNum = new ArrayList<>();
        StringBuilder segments = new StringBuilder();
        strToConvert += " ";

        for (int i = 0; i < strToConvert.length(); i++) {
            char ch = strToConvert.charAt(i);

            if (ch != 32) {
                segments.append(ch);

            } else if (segments.length() != 0) {
                listOfNum.add(Integer.parseInt(segments.toString()));
                segments.delete(0, segments.length());
            }
        }

        return listOfNum;
    }

    static String BePositive(ArrayList<Integer> listOfNum) {
        StringBuilder strToReturn = new StringBuilder();

        for (int i = 0; i < listOfNum.size(); i++) {

            if (listOfNum.get(i) >= 0) {
                strToReturn.append(listOfNum.get(i)).append(" ");
            } else if (listOfNum.get(i) + listOfNum.get(i + 1) >= 0) {
                strToReturn.append((listOfNum.get(i) + listOfNum.get(i + 1))).append(" ");
                i++;
            } else {
                i++;
            }
        }

        return strToReturn.toString().trim();
    }

}
