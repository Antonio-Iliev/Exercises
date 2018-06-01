package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_SayHello {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Greetings(reader.readLine());

    }

    static void Greetings(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
