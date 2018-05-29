package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P04_SieveOfEratosthenes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // defines range
        int numberRange = Integer.parseInt(reader.readLine());

        // create Integer Array starting with int 2 by given range.
        int[] primeArray = new int[numberRange - 1];
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = i + 2;
        }

        // create boolean Array and initialize with "True"
        boolean[] isPrime = new boolean[numberRange - 1];
        Arrays.fill(isPrime, Boolean.TRUE);

        // set Prime numbers variable and step for checking
        int numToCheck = 0;
        int step = primeArray[numToCheck];

        // checking algorithm | = primeArray.length + 1 for case when range is 25
        while (step * step <= primeArray.length + 1) {
            for (int j = step + numToCheck; j <= isPrime.length; j += step) {
                if (j < isPrime.length)
                    isPrime[j] = false;
            }

            // finding the next step of Prime number
            numToCheck++;
            while (!isPrime[numToCheck]) {
                numToCheck++;
            }
            step = primeArray[numToCheck];

        }

        // print the result
        PrintFinalResult(primeArray, isPrime);
    }


    static void PrintFormatArrayBool(boolean[] arrayBool, int[] arrayIny) {
        for (int i = 0; i < arrayBool.length; i++) {
            System.out.println(arrayBool[i] + " -> " + arrayIny[i] + " ");

        }
        System.out.println();
    }

    static void PrintFinalResult(int[] intArray, boolean[] boolArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (boolArray[i]) {
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
