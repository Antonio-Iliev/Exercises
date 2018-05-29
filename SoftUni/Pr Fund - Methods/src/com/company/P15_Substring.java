package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15_Substring {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "";
        boolean hasMatch = false;
        int numCount = 0;

        try {
            text = reader.readLine();
            numCount = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("try again");
        }


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'p') {
                for (int j = 0; j <= numCount; j++) {
                    if (i < text.length()) {
                        System.out.print(text.charAt(i));
                    }
                    i++;
                }
                System.out.println();
                hasMatch = true;
                i--;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }

    }
}
