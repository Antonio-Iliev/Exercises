package com.company;

import java.util.Scanner;

public class P05_Marguerita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("'&$"
                + repeatString("'", (n * 8) - 1)
        );

        for (int i = 0; i < n - 1; i++) {

            System.out.println(""
                    + repeatString("'", i + 2)
                    + "\\"
                    + repeatString("'", (n * 8) - 1 - i)
            );
        }

        for (int i = 1; i <= (n * 8) + 1; i++) {
            if (i % 2 != 0) {
                System.out.print("^");
            } else {
                System.out.print("*");
            }
        }

        System.out.println("'");

        for (int i = 0; i < n - 1; i++) {
            System.out.println(""
                    + repeatString("'", i)
                    + "\\\\"
                    + repeatString(" ", n)
                    + "\\"
                    + repeatString(" ", (n * 7) - 4 - (i * 2))
                    + "//"
                    + repeatString("'", i + 1)
            );

        }

        System.out.println(""
                + repeatString("'", n - 1)
                + "\\"
                + repeatString("~", (n * 6) + 1)
                + "/"
                + repeatString("'", n)
        );

        for (int i = 0; i < n - 2; i++) {
            System.out.println(""
                    + repeatString("'", n + i)
                    + "\\"
                    + repeatString(" ", (n * 6) - 1 - (i * 2))
                    + "/"
                    + repeatString("'", n + 1 + i)
            );
        }

        System.out.println(""
                + repeatString("'", (n * 2) - 2)
                + "\\"
                + repeatString("_", (n * 4) + 3)
                + "/"
                + repeatString("'", (n * 2) - 1)
        );

        System.out.println(""
                + repeatString("'", (n * 2) - 1)
                + "\\"
                + repeatString(".", (n * 4) + 1)
                + "/"
                + repeatString("'", n * 2)
        );

        for (int i = 0; i < (n * 2) - 2; i++) {
            System.out.println(""
                    + repeatString("'", n * 2 + i)
                    + "\\"
                    + repeatString(" ", (n * 4) - 1 - (i * 2))
                    + "/"
                    + repeatString("'", n * 2 + 1 + i)
            );
        }

        System.out.println(""
                + repeatString("'", (n * 4) - 2)
                + "\\"
                + "___"
                + "/"
                + repeatString("'", (n * 4) - 1)
        );

        String stand = ""
                + repeatString("'", (n * 4) - 1)
                + "|||"
                + repeatString("'", n * 4);
        for (int i = 0; i < (n * 2) + 1; i++) {
            System.out.println(stand);
        }


        System.out.println(""
                + repeatString("_", (n * 8) + 1)
                + "'"
        );

        System.out.println("'"
                + repeatString("-", (n * 8) - 1)
                + "''"
        );
    }

    static String repeatString(String strToRep, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRep;
        }
        return text;
    }
}

