package com.company;

import java.util.Scanner;

public class exam05_ChristmasSock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstRow = ""
                + "|"
                + repeatString("-", n * 2)
                + "|";

        System.out.println(firstRow);

        System.out.println(""
                + "|"
                + repeatString("*", n * 2)
                + "|");
        System.out.println(firstRow);

        for (int i = 1; i < n; i++) {
            System.out.println(""
                    + "|"
                    + repeatString("-", n - i)
                    + repeatString("~", 2 * i)
                    + repeatString("-", n - i)
                    + "|"
            );

        }

        for (int i = n - 1; i > 1; i--) {
            System.out.println(""
                    + "|"
                    + repeatString("-", n + 1 - i)
                    + repeatString("~", i * 2 - 2)
                    + repeatString("-", n + 1 - i)
                    + "|"
            );

        }

        String bottomPart = ""
                + "\\"
                + repeatString(".", n * 2 + 1)
                + "\\";

        for (int i = 0; i < n + 3; i++) {
            if (i == n + 2) {
                System.out.println(""
                        + repeatString("-", i)
                        + "\\"
                        + repeatString("_", n * 2 + 1)
                        + ")"
                );
            } else if (i == (int) (n / 2)) {
                System.out.println(""
                        + repeatString("-", i)
                        + "\\"
                        + repeatString(".", n - 2)
                        + "MERRY"
                        + repeatString(".", n - 2)
                        + "\\"
                );
                System.out.println(""
                        + repeatString("-", i + 1)
                        + "\\"
                        + repeatString(".", n * 2 + 1)
                        + "\\"
                );
                System.out.println(""
                        + repeatString("-", i + 2)
                        + "\\"
                        + repeatString(".", n - 2)
                        + "X-MAS"
                        + repeatString(".", n - 2)
                        + "\\"
                );
                i += 2;

            } else {
                System.out.println(""
                        + repeatString("-", i)
                        + bottomPart
                );
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
