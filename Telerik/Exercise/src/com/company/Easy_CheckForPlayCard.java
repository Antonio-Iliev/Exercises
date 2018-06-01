package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_CheckForPlayCard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        switch (input) {
            case "2":
                System.out.println("yes " + input);
                break;
            case "3":
                System.out.println("yes " + input);
                break;
            case "4":
                System.out.println("yes " + input);
                break;
            case "5":
                System.out.println("yes " + input);
                break;
            case "6":
                System.out.println("yes " + input);
                break;
            case "7":
                System.out.println("yes " + input);
                break;
            case "8":
                System.out.println("yes " + input);
                break;
            case "9":
                System.out.println("yes " + input);
                break;
            case "10":
                System.out.println("yes " + input);
                break;
            case "J":
                System.out.println("yes " + input);
                break;
            case "Q":
                System.out.println("yes " + input);
                break;
            case "K":
                System.out.println("yes " + input);
                break;
            case "A":
                System.out.println("yes " + input);
                break;
                default:
                    System.out.println("no " + input);
                    break;
        }
    }
}
