package com.company;

import java.util.Scanner;

public class P05_PIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(""
                + "/`"
                + repeatString("P", n * 2)
                + repeatString(" ", n)
                + "/`I"
                + repeatString(" ", n)
                + "/`N"
                + repeatString(" ", (n * 2) + 1)
                + "N"
        );

        for (int i = 0; i < n - 1; i++) {
            System.out.println(""
                    + "| "
                    + "P"
                    + repeatString(" ", (n * 2) - 2)
                    + "P"
                    + repeatString(" ", n)
                    + "| I"
                    + repeatString(" ", n)
                    + "| N"
                    + repeatString(" ", i)
                    + "N"
                    + repeatString(" ", (n * 2) - i)
                    + "N"
            );
        }

        System.out.println(""
                + "| "
                + repeatString("P", n * 2)
                + repeatString(" ", n)
                + "| I"
                + repeatString(" ", n)
                + "| N"
                + repeatString(" ", n - 1)
                + "N"
                + repeatString(" ", n + 1)
                + "N"
        );

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + "| "
                    + repeatString("P", n / 2)
                    + repeatString(" ", (n * 3) - (n / 2))
                    + "| I"
                    + repeatString(" ", n)
                    + "| N"
                    + repeatString(" ", n + i)
                    + "N"
                    + repeatString(" ", n - i)
                    + "N"
            );
        }

        System.out.println(""
                + "\\_"
                + repeatString("P", n / 2)
                + repeatString(" ", (n * 3) - (n / 2))
                + "\\_I"
                + repeatString(" ", n)
                + "\\_N"
                + repeatString(" ", n * 2)
                + "NN"
        );
    }

    static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
