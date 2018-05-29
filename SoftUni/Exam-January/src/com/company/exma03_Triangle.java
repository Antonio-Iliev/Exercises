package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exma03_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());


        boolean itsTriangle = a < (b + c) && b < (a + c) && c < (a + b);

        if (itsTriangle) {
            if (a == b && a == c) {
                System.out.printf("Triangle with sides %s, %s and %s is equilateral.",
                        df.format(a), df.format(b), df.format(c));
            } else if (a == b || a == c || b == c) {
                System.out.printf("Triangle with sides %s, %s and %s is isosceles.",
                        df.format(a), df.format(b), df.format(c));
            } else {
                System.out.printf("Triangle with sides %s, %s and %s is scalene.",
                        df.format(a), df.format(b), df.format(c));
            }

        } else {
            System.out.printf("There is no triangle with sides %s, %s and %s.",
                    df.format(a), df.format(b), df.format(c));
        }

    }
}
