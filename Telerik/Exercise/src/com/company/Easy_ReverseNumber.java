package com.company;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Easy_ReverseNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputNumb = reader.readLine();

        System.out.println(ReversNumber(inputNumb));
    }

    static String ReversNumber (String strToRevers){
        StringBuilder reversedText = new StringBuilder();

        reversedText.append(strToRevers).reverse();

        return reversedText.toString();
    }
}
