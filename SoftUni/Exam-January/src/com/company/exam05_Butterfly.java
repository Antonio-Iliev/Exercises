package com.company;

import java.util.Scanner;

public class exam05_Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 4) {
            for (int i = 1; i <= n - 2; i++) {
                System.out.println(""
                        + repeatString("*\\", i)
                        + repeatString(" ", (n * 4) - 4 - i * 4)
                        + repeatString("/*", i)
                );
            }

            System.out.println(repeatString("\\/", (n * 2) - 2));

            String middle = ""
                    + repeatString("<", (n * 2) - 5)
                    + "*|**|*"
                    + repeatString(">", (n * 2) - 5);

            for (int i = 0; i < n / 2; i++) {
                System.out.println(middle);
            }

            System.out.println(repeatString("/\\", (n * 2) - 2));

            for (int i = 0; i < n - 2; i++) {
                System.out.println(""
                        + repeatString("*/", (n - 2) - i)
                        + repeatString(" ", 4 + i * 4)
                        + repeatString("\\*", (n - 2) - i)
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
