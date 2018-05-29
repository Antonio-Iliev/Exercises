package com.company;

import java.util.Scanner;

public class demo14_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 4 && n <= 60 && n % 2 == 0) {

            System.out.println(
                    repeatString("_", (n + 4) / 2)
                            + "^"
                            + repeatString("_", (n + 4) / 2)
            );

            System.out.println(
                    repeatString("_", (n + 2) / 2)
                            + "/|\\"
                            + repeatString("_", (n + 2) / 2)
            );


            for (int i = 0; i < n / 2; i++) {
                System.out.println(""
                        + repeatString("_", n / 2 - i)
                        + "/"
                        + repeatString(".", i)
                        + "|||"
                        + repeatString(".", i)
                        + "\\"
                        + repeatString("_", n / 2 - i)
                );
            }

            for (int i = 0; i < 2; i++) {
                System.out.println(""
                        + repeatString("_", (n - 4) / 2 + i)
                        + "/"
                        + repeatString(".", 2 - i)
                        + "|||"
                        + repeatString(".", 2 - i)
                        + "\\"
                        + repeatString("_", (n - 4) / 2 + i)
                );
            }

            String rowMiddle = repeatString("_", (n + 2) / 2);
            for (int i = 0; i < n; i++) {
                System.out.println(""
                        + rowMiddle
                        + "|||"
                        + rowMiddle
                );
            }

            System.out.println(""
                    + rowMiddle
                    + "~~~"
                    + rowMiddle
            );


            for (int i = 0; i < n / 2; i++) {
                System.out.println(""
                        + repeatString("_", n / 2 - i)
                        + "//"
                        + repeatString(".", i)
                        + "!"
                        + repeatString(".", i)
                        + "\\\\"
                        + repeatString("_", n / 2 - i)
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
