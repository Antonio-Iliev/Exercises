package com.company;

import java.util.Scanner;

public class P05_Skyscraper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 3; i++) {
            System.out.println(""
                    + repeatString(" ", n)
                    + "|"
            );
        }

        System.out.println(""
                + repeatString(" ", n - 1)
                + "_|_"
        );

        for (int i = 0; i < n - 3; i++) {
            System.out.println(""
                    + repeatString(" ", n - 1)
                    + "|-|"
            );
        }

        System.out.println(""
                + repeatString(" ", n - 2)
                + "_|-|_"
        );


        for (int i = 0; i < n - 3; i++) {
            System.out.println(""
                    + repeatString(" ", n - 2)
                    + "|***|"
            );
        }

        System.out.println(" "
                + repeatString("_", n - 3)
                + "|***|"
                + repeatString("_", n - 3)
        );

        for (int i = 1; i < n * 4; i++) {
            System.out.println(" "
                    + repeatString("|", n - 2)
                    + "---"
                    + repeatString("|", n - 2)
            );

        }

        System.out.println("_"
                + repeatString("|", n - 2)
                + "---"
                + repeatString("|", n - 2)
                + "_"
        );

        String finalRow = repeatString("|", (n * 2) + 1);

        for (int i = 0; i < n - 2; i++) {
            System.out.println(finalRow);
        }


    }

    static String repeatString(String strToRep, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRep;
        }
        return text;
    }
}
