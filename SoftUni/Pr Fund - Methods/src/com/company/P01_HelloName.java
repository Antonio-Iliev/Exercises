package com.company;

import java.util.Scanner;

public class P01_HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(AddGreetingToName(scanner.nextLine()));

    }

    static String AddGreetingToName(String nameToGreet) {
        String helloName = "Hello, " + nameToGreet + "!";

        return helloName;
    }

}
