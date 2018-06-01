package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Easy_SpiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[][] spMat = new int[n][n];

        int row = 0;
        int col = 0;

        spMat[0][0] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (spMat[row].length - 1 > col && spMat[row][col + 1] == 0 && spMat.length - 1 > row) {
                col++;
                spMat[row][col] = i;

            } else if (spMat.length - 1 > row && spMat[row + 1][col] == 0) {
                row++;
                spMat[row][col] = i;

            } else if (col > 0 && spMat[row][col - 1] == 0) {
                col--;
                spMat[row][col] = i;

            } else if (row > 0 && spMat[row - 1][col] == 0) {
                row--;
                spMat[row][col] = i;

            }
        }

        PrintArray(spMat);
    }

    static void PrintArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
