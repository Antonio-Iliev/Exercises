package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Easy_GCD {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0){
            int t = b;
            b = a % b;
            a = t;
        }

        System.out.println(a);
    }
}
