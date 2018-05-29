package com.company;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputBirthDay = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(inputBirthDay, formatter);
        LocalDate afterYears = localDate.plusDays(999);

        System.out.println("");
        System.out.println(formatter.format(localDate));
        System.out.println(formatter.format(afterYears));

    }
}