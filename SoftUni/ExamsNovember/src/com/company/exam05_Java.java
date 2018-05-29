package com.company;

import java.util.Scanner;

public class exam05_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String smoke = ""
                + repeatString(" ", n)
                + "~ ~ ~";

        for (int i = 0; i < n; i++) {
            System.out.println(smoke);

        }

        String border = repeatString("=", (n * 3) + 5);
        System.out.println(border);

        for (int i = 1; i <= n - 2; i++) {
            if (i == n / 2) {
                System.out.println(""
                        + "|"
                        + repeatString("~", n)
                        + "JAVA"
                        + repeatString("~", n)
                        + "|"
                        + repeatString(" ", n - 1)
                        + "|"
                );
            } else {
                System.out.println(""
                        + "|"
                        + repeatString("~", (n * 2) + 4)
                        + "|"
                        + repeatString(" ", n - 1)
                        + "|"
                );
            }
        }

        System.out.println(border);

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + repeatString(" ", i)
                    + "\\"
                    + repeatString("@", (n * 2) + 4 - (i * 2))
                    + "/"
            );

        }

        System.out.println(repeatString("=", (n * 2) + 6));


    }

    static String repeatString(String strToRep, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRep;
        }
        return text;
    }
}
