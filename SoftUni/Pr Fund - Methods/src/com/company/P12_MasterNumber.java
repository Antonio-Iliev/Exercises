package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_MasterNumber {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = 0;

        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Isn't a number");
        }

        for (int i = 232; i <= number; i++) {
            if (IsPalindrome(i) && SumOfDigitsDivisibleBy7(i) && ContainsEvenDigit(i)) {
                System.out.println(i);
            }
        }


    }

    static boolean IsPalindrome(int numb) {
        String inputNumb = "" + numb;
        int begin = 0;
        int end = inputNumb.length() - 1;

        for (int i = 0; i <= end / 2; i++) {
            if (inputNumb.charAt(begin) == inputNumb.charAt(end)) {
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean SumOfDigitsDivisibleBy7(int numb) {
        String inputNumb = "" + numb;
        int sum = 0;

        for (int i = 0; i < inputNumb.length(); i++) {
            sum += (int) inputNumb.charAt(i) - '0';
        }

        return sum % 7 == 0;
    }

    static boolean ContainsEvenDigit(int numb) {
        String inputNumb = "" + numb;

        for (int i = 0; i < inputNumb.length(); i++) {
            int oneNum = inputNumb.charAt(i) - '0';
            if (oneNum % 2 == 0) {
                return true;
            }
        }
        return false;
    }

}
