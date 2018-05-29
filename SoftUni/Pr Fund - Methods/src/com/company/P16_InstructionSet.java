package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16_InstructionSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        while (true) {
            input = reader.readLine();

            String command = input.substring(0, 3);

            switch (command) {
                case "INC":
                    System.out.println(IncrementsNumber(input));
                    break;
                case "DEC":
                    System.out.println(DecrementsNumber(input));
                    break;
                case "ADD":
                    System.out.println(AdditionTwoNumbers(input));
                    break;
                case "MLA":
                    System.out.println(MultiplicationTwoNum(input));
                    break;
                case "END":
                    return;
            }


        }

    }

    static long IncrementsNumber(String strNum) {
        long num = Long.parseLong(strNum.substring(4, strNum.length()));
        num++;
        return num;
    }

    static long DecrementsNumber(String strNum) {
        long num = Long.parseLong(strNum.substring(4, strNum.length()));
        num--;
        return num;
    }

    static long AdditionTwoNumbers(String strNum) {
        strNum = strNum.substring(4, strNum.length());

        int num1 = Integer.parseInt(strNum.substring(0, strNum.indexOf(" ")));
        int num2 = Integer.parseInt(strNum.substring(strNum.indexOf(" ") + 1, strNum.length()));

        long result = (long) num1 + num2;
        return result;
    }

    static long MultiplicationTwoNum(String strNum) {
        strNum = strNum.substring(4, strNum.length());

        int num1 = Integer.parseInt(strNum.substring(0, strNum.indexOf(" ")));
        int num2 = Integer.parseInt(strNum.substring(strNum.indexOf(" ") + 1, strNum.length()));

        long result = (long) num1 * num2;
        return result;
    }

}
