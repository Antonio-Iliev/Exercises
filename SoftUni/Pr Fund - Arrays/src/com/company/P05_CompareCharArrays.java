package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_CompareCharArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().replaceAll(" ", "");
        char[] arr1 = input.toCharArray();

        input = reader.readLine().replaceAll(" ", "");
        char[] arr2 = input.toCharArray();

        if (arr1.length <= arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] < arr2[i]) {
                    System.out.println(CharArrayToString(arr1));
                    System.out.println(CharArrayToString(arr2));
                    return;
                } else if (arr1[i] == arr2[i]) {
                    if (i + 1 == arr1.length) {
                        System.out.println(CharArrayToString(arr1));
                        System.out.println(CharArrayToString(arr2));
                        return;
                    }
                } else {
                    System.out.println(CharArrayToString(arr2));
                    System.out.println(CharArrayToString(arr1));
                    return;
                }

            }
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] < arr2[i]) {
                    System.out.println(CharArrayToString(arr1));
                    System.out.println(CharArrayToString(arr2));
                    return;
                } else if (arr1[i] == arr2[i]) {
                    if (i + 1 == arr2.length) {
                        System.out.println(CharArrayToString(arr2));
                        System.out.println(CharArrayToString(arr1));
                        return;
                    }
                } else {
                    System.out.println(CharArrayToString(arr2));
                    System.out.println(CharArrayToString(arr1));
                    return;
                }

            }
        }

    }

    static StringBuilder CharArrayToString(char[] array) {
        StringBuilder textToReturn = new StringBuilder();
        for (char ch : array) {
            textToReturn.append(ch);
        }
        return textToReturn;
    }
}
