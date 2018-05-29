package com.company;

import java.util.Scanner;

public class exam02_Lutenitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tomatoes = Double.parseDouble(scanner.nextLine());
        double crates = Double.parseDouble(scanner.nextLine());
        double jars = Double.parseDouble(scanner.nextLine());


        double lutenica = tomatoes / 5;
        double jarsWithLuten = lutenica / 0.535;
        double cratesWithJar = jarsWithLuten / jars;

        if (cratesWithJar > crates) {
            cratesWithJar -= crates;
            jarsWithLuten -= crates * jars;

            System.out.printf("Total lutenica: %.0f kilograms.%n" +
                            "%.0f boxes left.%n" +
                            "%.0f jars left.",
                    lutenica, Math.floor(cratesWithJar), Math.floor(jarsWithLuten));
        } else {

            cratesWithJar = crates - cratesWithJar;
            jarsWithLuten = (crates * jars) - jarsWithLuten;

            System.out.printf("Total lutenica: %.0f kilograms.%n" +
                            "%.0f more boxes needed.%n" +
                            "%.0f more jars needed.",
                    lutenica, Math.floor(cratesWithJar), Math.floor(jarsWithLuten));
        }


    }
}
