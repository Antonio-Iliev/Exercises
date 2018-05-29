package com.company;

import java.util.Scanner;

public class ex10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLast = "";
        int midValue = n - 4;

        if (n % 2 != 0) {

            firstAndLast = repeatText("-", n / 2)
                    + "*"
                    + repeatText("-", n / 2);

            System.out.println(firstAndLast);

            for (int i = 0; i < n / 2.0 - 1; i++) {
                System.out.println(
                        repeatText("-", n / 2 - i - 1)
                                + "*-"
                                + repeatText("-", i * 2)
                                + "*"
                                + repeatText("-", n / 2 - i - 1)
                );
            }


            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.println(repeatText("-", i + 1)
                        + "*"
                        + repeatText("-", midValue)
                        + "*"
                        + repeatText("-", i + 1));
                midValue -= 2;
            }

            if (n != 1) {
                System.out.println(firstAndLast);
            }


        } else {
            firstAndLast = repeatText("-", n / 2 - 1)
                    + "**"
                    + repeatText("-", n / 2 - 1);

            System.out.println(firstAndLast);

            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.println(
                        repeatText("-", n / 2 - i - 2)
                                + "*-"
                                + repeatText("-", i * 2 + 1)
                                + "*"
                                + repeatText("-", n / 2 - i - 2)
                );

            }


            for (int i = 0; i < n / 2.0 - 2; i++) {
                System.out.println(repeatText("-", i + 1)
                        + "*"
                        + repeatText("-", midValue)
                        + "*"
                        + repeatText("-", i + 1));
                midValue -= 2;
            }

            if (n != 2) {
                System.out.println(firstAndLast);
            }

        }


    }

    static String repeatText(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
