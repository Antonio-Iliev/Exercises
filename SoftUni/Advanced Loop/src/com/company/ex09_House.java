package com.company;

import java.util.Scanner;

public class ex09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 2 != 0) {
            for (int i = 0; i < n / 2.0; i++) {
                System.out.println(
                        repeatText("-", n / 2 - i)
                                + repeatText("*", i * 2 + 1)
                                + repeatText("-", n / 2 - i)
                );

            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                System.out.println(
                        repeatText("-", n / 2 - i - 1)
                                + repeatText("**", i + 1)
                                + repeatText("-", n / 2 - i - 1)
                );

            }
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(
                    "|"
                            + repeatText("*", n - 2)
                            + "|"
            );
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
