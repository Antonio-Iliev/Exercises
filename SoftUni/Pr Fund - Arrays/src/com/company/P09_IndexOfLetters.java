package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_IndexOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] lettersArray = reader.readLine().toCharArray();


        for (char letter : lettersArray) {
            System.out.println(letter + " -> " + (letter - 'a'));
        }

    }

}
