package com.company;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Easy_Change {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BigInteger number1 = new BigInteger(scanner.next());
        BigInteger number2 = new BigInteger(scanner.next());

        System.out.println(number1.subtract(number2));

    }
}
