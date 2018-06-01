package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_Trapezoid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.println(""
                + StringToRepeat(".", n)
                + StringToRepeat("*", n)
        );

        for (int i = 0; i < n - 1; i++) {
            System.out.println(""
                    + StringToRepeat(".", n - 1 - i)
                    + "*"
                    + StringToRepeat(".", n - 1 + i)
                    + "*");
        }

        System.out.println(""
                + StringToRepeat("*", n * 2)
        );
    }

    static String StringToRepeat(String strToRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count; i++) {
            text.append(strToRepeat);
        }

        return text.toString();
    }
}
