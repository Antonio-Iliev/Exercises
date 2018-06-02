package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_PaperCutter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        boolean[] paperIsUsed = new boolean[11];

        while (n != 0) {
            if (n - 1024 >= 0) {
                n -= 1024;
                paperIsUsed[0] = true;

            } else if (n - 512 >= 0) {
                n -= 512;
                paperIsUsed[1] = true;

            } else if (n - 256 >= 0) {
                n -= 256;
                paperIsUsed[2] = true;

            } else if (n - 128 >= 0) {
                n -= 128;
                paperIsUsed[3] = true;

            } else if (n - 64 >= 0) {
                n -= 64;
                paperIsUsed[4] = true;

            } else if (n - 32 >= 0) {
                n -= 32;
                paperIsUsed[5] = true;

            } else if (n - 16 >= 0) {
                n -= 16;
                paperIsUsed[6] = true;

            } else if (n - 8 >= 0) {
                n -= 8;
                paperIsUsed[7] = true;

            } else if (n - 4 >= 0) {
                n -= 4;
                paperIsUsed[8] = true;

            } else if (n - 2 >= 0) {
                n -= 2;
                paperIsUsed[9] = true;

            } else if (n - 1 >= 0) {
                n -= 1;
                paperIsUsed[10] = true;
            }
        }

        PrintResult(paperIsUsed);

    }

    static void PrintResult(boolean[] paperIsUsed) {
        String[] paperFormat = new String[11];
        for (int i = 0; i < paperFormat.length; i++) {
            paperFormat[i] = "A" + i;
        }

        for (int i = 0; i < paperFormat.length; i++) {
            if (!paperIsUsed[i]){
                System.out.println(paperFormat[i]);
            }

        }
    }
}
