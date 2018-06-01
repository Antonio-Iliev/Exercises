package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_NumbersInText {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().replaceAll("\\D+", "");

        int sum = 0;
        if (input.length()>0){
            for (int i = 0; i < input.length() ; i++) {
                char ch = input.charAt(i);
                sum += ch - '0';
            }
            System.out.println(sum);
        }else {
            System.out.println("-1");
        }
    }
}
