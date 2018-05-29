package com.company;

import java.util.Scanner;

public class P05_SublimeLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + repeatString(" ", (n * 2) - 2 - (i * 2))
                    + repeatString("*", 2 + (i * 2))
            );
        }

        System.out.println(""
                + repeatString("*", (n * 2) - 2)
        );

        for (int i = 0; i < 3; i++) {
            System.out.println(""
                    + repeatString("*", (n * 2) - 4 + (i * 2))
            );
        }

        System.out.println("  "
                + repeatString("*", (n * 2) - 2)
        );

        for (int i = 0; i < 2; i++) {
            System.out.println(""
                    + repeatString(" ", 4 - (i * 2))
                    + repeatString("*", (n * 2) - 4 + (i * 2))
            );
        }

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + repeatString("*", (n * 2) - (i * 2))
            );
        }
    }

    static String repeatString(String srtToRep, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += srtToRep;
        }
        return text;
    }
}
