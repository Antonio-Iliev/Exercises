package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P06_PrimeChecker_v3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strInput = "";

        try {
            strInput = reader.readLine();
        } catch (IOException e) {
            System.out.println("It isn't a number");
        }


        if (IsPrime(strInput)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static boolean IsPrime(String stringNumber) {
        int intNumb = 0;
        BigInteger bigInt = BigInteger.valueOf(0);


        if (stringNumber.charAt(0) != '-') {
            if (stringNumber.length() < 10) {
                intNumb = Integer.parseInt(stringNumber);
                if (intNumb > 1) {
                    for (int i = 2; i <= Math.sqrt(intNumb); i++) {
                        if (intNumb % i == 0) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }

            } else {
                bigInt = new BigInteger(stringNumber);
                int number = Integer.parseInt(bigInt.sqrt().toString());

                for (int i = 2; i <= number; i++) {
                    int compere = Integer.parseInt(bigInt.mod(BigInteger.valueOf(i)).toString());

                    if (compere == 0) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}