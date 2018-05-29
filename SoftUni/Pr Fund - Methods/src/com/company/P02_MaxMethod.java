package com.company;

import java.util.Scanner;

public class P02_MaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();

        int maxNumb = GetMaxNumber(numb1, numb2);
        maxNumb = GetMaxNumber(maxNumb, numb3);

        System.out.println(maxNumb);

    }

    static int GetMaxNumber(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

}
