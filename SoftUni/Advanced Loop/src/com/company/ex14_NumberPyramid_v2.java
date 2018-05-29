package com.company;

import java.util.Scanner;

public class ex14_NumberPyramid_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numb = 0;
        int col = 0;
        int row = 0;

        for (col = 1; col <= n; col++) {
            for (row = 0; row <= n - col; row++) {

                numb = col + row;
                System.out.print(numb + " ");
            }

            for (int secRow = n; secRow > row; secRow--) {
                numb -= 1;
                System.out.print(numb + " ");
            }

            System.out.println();
        }
    }
}
