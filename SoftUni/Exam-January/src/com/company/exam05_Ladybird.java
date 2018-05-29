package com.company;

import java.util.Scanner;

public class exam05_Ladybird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(""
                + repeatString(" ", n - 2)
                + "@   @"
        );

        System.out.println(""
                + repeatString(" ", n - 1)
                + "\\_/"
        );

        System.out.println(""
                + repeatString(" ", n - 1)
                + "/ \\"
        );

        System.out.println(""
                + repeatString(" ", n - 1)
                + "|_|"
        );

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + repeatString(" ", (n - 1) - i)
                    + "/"
                    + repeatString(" ", i)
                    + "|"
                    + repeatString(" ", i)
                    + "\\"
            );
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(""
                    + "|"
                    + repeatString(" ", (n - 2) / 2)
                    + "@"
                    + repeatString(" ", (n - 1) / 2)
                    + "|"
                    + repeatString(" ", (n - 1) / 2)
                    + "@"
                    + repeatString(" ", (n - 2) / 2)
                    + "|"
            );
        }

        if (n > 2) {
            for (int i = 0; i < (n + 2) / 2 - 1; i++) {
                System.out.println(""
                        + repeatString(" ", i)
                        + "\\"
                        + repeatString(" ", n - 1 - i)
                        + "|"
                        + repeatString(" ", n - 1 - i)
                        + "/"
                );
            }
        }

        System.out.println(""
                + repeatString(" ", (n + 1) / 2)
                + repeatString("^", n / 2)
                + "|"
                + repeatString("^", n / 2)

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
