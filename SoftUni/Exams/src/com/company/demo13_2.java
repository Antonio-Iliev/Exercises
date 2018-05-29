package com.company;

import java.util.Scanner;

public class demo13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 4 && n <= 50) {

            System.out.println(
                    repeatString("#", n - 1)
                            + "/^\\"
                            + repeatString("#", n - 1)
            );

            for (int i = 0; i < n / 2; i++) {
                System.out.println(
                        repeatString("#", (n - 2) - i)
                                + "."
                                + repeatString(" ", 3 + i * 2)
                                + "."
                                + repeatString("#", (n - 2) - i)
                );
            }

            String rowPart1 = repeatString("#", (n - 1) / 2)
                    + "|"
                    + repeatString(" ", n / 2);
            String rowPart2 = repeatString(" ", n / 2)
                    + "|"
                    + repeatString("#", (n - 1) / 2);

            System.out.println(rowPart1 + "S" + rowPart2);
            System.out.println(rowPart1 + "O" + rowPart2);
            System.out.println(rowPart1 + "F" + rowPart2);
            System.out.println(rowPart1 + "T" + rowPart2);

            if (n != 4) {
                for (int i = 0; i < n - 4; i++) {
                    System.out.println(rowPart1 + " " + rowPart2);
                }
            } else {
                System.out.println(rowPart1 + " " + rowPart2);
            }

            System.out.println(rowPart1 + "U" + rowPart2);
            System.out.println(rowPart1 + "N" + rowPart2);
            System.out.println(rowPart1 + "I" + rowPart2);

            System.out.println(
                    "@"
                            + repeatString("=", n * 2 - 1)
                            + "@"
            );

            if (n <= 5) {
                String rowLast = repeatString("#", n - 1)
                        + "| |"
                        + repeatString("#", n - 1);

                for (int i = 0; i < n / 2; i++) {
                    System.out.println(rowLast);
                }

                System.out.println(
                        repeatString("#", n - 1)
                                + "\\./"
                                + repeatString("#", n - 1)
                );

            } else {
                String rowLast = repeatString("#", n - 2)
                        + "|   |"
                        + repeatString("#", n - 2);
                for (int i = 0; i < n / 2; i++) {
                    System.out.println(rowLast);
                }

                System.out.println(
                        repeatString("#", n - 2)
                                + "\\.../"
                                + repeatString("#", n - 2));
            }


        }


    }

    static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
