package com.company;

import java.util.Scanner;

public class P05_Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n / 2; i++) {
            System.out.println(""
                    + repeatStr(".", n + i)
                    + repeatStr("#", (n * 3) - (i * 2))
                    + repeatStr(".", n + i)
            );
        }

        for (int i = 0; i < (n / 2) + 1; i++) {
            System.out.println(""
                    + repeatStr(".", (n * 3) / 2 + i)
                    + "#"
                    + repeatStr(".", (n * 2) - 2 - (i * 2))
                    + "#"
                    + repeatStr(".", (n * 3) / 2 + i)
            );
        }

        System.out.println(""
                + repeatStr(".", n * 2)
                + repeatStr("#", n)
                + repeatStr(".", n * 2)
        );

        String handleString = ""
                + repeatStr(".", (n * 2) - 2)
                + repeatStr("#", n + 4)
                + repeatStr(".", (n * 2) - 2);

        for (int i = 0; i < n / 2; i++) {
            System.out.println(handleString);
        }

        System.out.println(""
                + repeatStr(".", ((n * 5) - 10) / 2)
                + "D^A^N^C^E^"
                + repeatStr(".", ((n * 5) - 10) / 2)
        );

        for (int i = 0; i < (n / 2) + 1; i++) {
            System.out.println(handleString);
        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
