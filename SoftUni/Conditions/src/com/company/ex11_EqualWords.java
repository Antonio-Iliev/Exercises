package com.company;

import java.util.Scanner;

public class ex11_EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.toLowerCase().equals(name2.toLowerCase())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
