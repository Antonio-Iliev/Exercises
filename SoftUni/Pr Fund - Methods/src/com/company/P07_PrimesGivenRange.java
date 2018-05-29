package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class P07_PrimesGivenRange {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int startNumb = 0;
        int endNumb = 0;

        try {
            startNumb = Integer.parseInt(reader.readLine());
            endNumb = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            System.out.println("It isn't a number");
        }

        ArrayList<Integer> primesInRangeArray = FindPrimesInRangeArray(startNumb, endNumb);

        String primInRangeString = FromArrayToString(primesInRangeArray);


        System.out.println(primInRangeString);


    }

    static ArrayList<Integer> FindPrimesInRangeArray(int fromNumb, int toNumb) {
        if (fromNumb <= 1) {
            fromNumb = 2;
        }

        ArrayList<Integer> primesArray = new ArrayList<>();

        for (int i = fromNumb; i <= toNumb; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primesArray.add(i);
            }

        }

        return primesArray;
    }

    static String FromArrayToString(ArrayList arrayToString) {

        String listStringToReturn = "";

        for (int i = 0; i < arrayToString.size(); i++) {
            listStringToReturn += arrayToString.get(i) + ", ";
        }

        return listStringToReturn.substring(0, listStringToReturn.length() - 2);
    }
}
