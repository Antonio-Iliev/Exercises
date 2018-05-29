package com.company;

import java.util.Scanner;

public class demo07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int lnghOfSer = Integer.parseInt(scanner.nextLine());

        if (gender.equals("male") || gender.equals("female")) {
// za male
            if (gender.equals("male") && age >= 64 && lnghOfSer >= 38) {
                System.out.printf("Ready to retire at %d and %d years of experience!",
                        age, lnghOfSer);
            } else if (gender.equals("male") && age < 64 && lnghOfSer >= 38) {
                int diff = 64 - age;
                System.out.printf("Worked enough, but not old enough. " +
                        "Years left to retirement: %d.", diff);
            } else if (gender.equals("male") && age >= 64 && lnghOfSer < 38) {
                int diff = 38 - lnghOfSer;
                System.out.printf("Old enough, but haven't worked enough." +
                        " Work experience left to retirement: %d.", diff);
            } else if (gender.equals("male") && age < 64 && lnghOfSer < 38) {
                int diffAge = 64 - age;
                int diffSer = 38 - lnghOfSer;
                System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.",
                        diffAge, diffSer);
            }

// za female
            else if (gender.equals("female") && age >= 61 && lnghOfSer >= 35) {
                System.out.printf("Ready to retire at %d and %d years of experience!",
                        age, lnghOfSer);
            } else if (gender.equals("female") && age < 61 && lnghOfSer >= 35) {
                int diff = 61 - age;
                System.out.printf("Worked enough, but not old enough. " +
                        "Years left to retirement: %d.", diff);
            } else if (gender.equals("female") && age >= 61 && lnghOfSer < 35) {
                int diff = 35 - lnghOfSer;
                System.out.printf("Old enough, but haven't worked enough." +
                        " Work experience left to retirement: %d.", diff);
            } else if (gender.equals("female") && age < 61 && lnghOfSer < 35) {
                int diffAge = 61 - age;
                int diffSer = 35 - lnghOfSer;
                System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.",
                        diffAge, diffSer);
            }


        } else {
            System.out.println("Invalid input.");
        }


    }
}
