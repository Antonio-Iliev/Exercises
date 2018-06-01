package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_SpiralMatrix_v3 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[][] spiral = new int[n][n];

        int num = 1;

        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (num <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = num;
                num++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = num;
                num++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = num;
                num++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = num;
                num++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}
