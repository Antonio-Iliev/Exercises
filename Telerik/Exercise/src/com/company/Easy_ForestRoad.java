package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_ForestRoad {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println(""
                    + RepeatString(".", i)
                    + "*"
                    + RepeatString(".", n-1-i)
            );
        }

        for (int i = 1; i < n; i++) {
            System.out.println(""
                    + RepeatString(".", n-1 -i)
                    + "*"
                    + RepeatString(".", i)
            );
        }

    }

    static StringBuilder RepeatString (String strTorepeat, int count){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; i++) {
            text.append(strTorepeat);
        }
        return text;
    }
}
