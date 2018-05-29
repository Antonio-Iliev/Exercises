package com.company;

import java.util.Scanner;

public class ex09_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordIN = scanner.nextLine();

        String passwords = "s3cr3t!P@ssw0rd";

        if (passwordIN.equals(passwords)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
