package com.company;

import java.util.Scanner;

public class demo12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        if (n >= 5 && n <= 59) {

            for (int i = 0; i < n - 1; i++) {
                String shapka = repeatString(" ", n - 2 - i)
                        + "/"
                        + repeatString(" ", i)
                        + "|  |"
                        + repeatString(" ", i)
                        + "\\";
                System.out.println(shapka);
            }

            System.out.println(repeatString("-", (n * 2) + 2));

            System.out.println("|"
                    + repeatString(" ", (int) ((n / 2) - 1))
                    + "_"
                    + repeatString(" ", n + 1)
                    + "_"
                    + repeatString(" ", (int) ((n / 2) - 1))
                    + "|"
            );


            System.out.println("|"
                    + repeatString(" ", (int) ((n / 2) - 1))
                    + "@"
                    + repeatString(" ", n + 1)
                    + "@"
                    + repeatString(" ", (int) ((n / 2) - 1))
                    + "|"
            );


            String rowMiddle = "|" + repeatString(" ", n * 2) + "|";
            for (int i = 0; i < (n - 1) / 2; i++) {
                System.out.println(rowMiddle);
            }


            System.out.println("|"
                    + repeatString(" ", n - 1)
                    + "OO"
                    + repeatString(" ", n - 1)
                    + "|"
            );


            System.out.println("|"
                    + repeatString(" ", n - 2)
                    + "/  \\"
                    + repeatString(" ", n - 2)
                    + "|"
            );


            System.out.println("|"
                    + repeatString(" ", n - 2)
                    + "||||"
                    + repeatString(" ", n - 2)
                    + "|"
            );


            for (int i = 0; i <= n; i++) {

                System.out.println(
                        repeatString("\\", i + 1)
                                + repeatString("`", n * 2 - i * 2)
                                + repeatString("/", i + 1)
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
