package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_SecretMessage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder secretMessage = new StringBuilder();
        secretMessage.append(reader.readLine().replaceAll("[0-9]", ""));
        secretMessage.reverse();

        System.out.println(secretMessage);
    }
}
