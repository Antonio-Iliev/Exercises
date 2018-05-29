package com.company;

import java.util.Scanner;

public class ex16_NumberToText100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int firstNumber = 0;
        String one = "one";

        //int test = Integer.parseInt(scanner.next(1))


        if (number < 0) {
            System.out.println("invalid number");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else if (number == 10) {
            System.out.println("ten");
        } else if (number == 11) {
            System.out.println("eleven");
        } else if (number == 12) {
            System.out.println("eleven");
        } else if (number == 13) {
            System.out.println("thirteen");
        } else if (number == 14) {
            System.out.println("fourteen");
        } else if (number == 15) {
            System.out.println("fifteen");
        } else if (number == 16) {
            System.out.println("sixteen");
        } else if (number == 17) {
            System.out.println("seventeen");
        } else if (number == 18) {
            System.out.println("eighteen");
        } else if (number == 19) {
            System.out.println("nineteen");
        } else if (number < 30) { // часта с 20 и..
            firstNumber = number % 20;
            System.out.printf("twenty %s", firstNumber);
        } else {
            System.out.println("invalid number");
        }
    }
}
