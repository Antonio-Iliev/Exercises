package com.company;

import java.util.Scanner;

public class exam05_ChristmasToy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLast = ""
                + repeatString("-", n * 2)
                + repeatString("*", n)
                + repeatString("-", n * 2);
        System.out.println(firstAndLast);

        for (int i = 1; i <= n / 2; i++) {
            System.out.println(""
                    + repeatString("-", (n * 2) - i * 2)
                    + repeatString("*", i)
                    + repeatString("&", n + i * 2)
                    + repeatString("*", i)
                    + repeatString("-", (n * 2) - i * 2)
            );
        }

        for (int i = 1; i <= n / 2; i++) {
            System.out.println(""
                    + repeatString("-", n - i)
                    + "**"
                    + repeatString("~", (n * 3) - 4 + i * 2)
                    + "**"
                    + repeatString("-", n - i)
            );
        }

        System.out.println(""
                + repeatString("-", n / 2)
                + "*"
                + repeatString("|", (n * 4) - 2)
                + "*"
                + repeatString("-", n / 2)
        );

        for (int i = n / 2; i >= 1; i--) {
            System.out.println(""
                    + repeatString("-", n - i)
                    + "**"
                    + repeatString("~", (n * 3) - 4 + i * 2)
                    + "**"
                    + repeatString("-", n - i)
            );
        }

        for (int i = n / 2; i >= 1; i--) {
            System.out.println(""
                    + repeatString("-", (n * 2) - i * 2)
                    + repeatString("*", i)
                    + repeatString("&", n + i * 2)
                    + repeatString("*", i)
                    + repeatString("-", (n * 2) - i * 2)
            );
        }


        System.out.println(firstAndLast);

    }

    static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
