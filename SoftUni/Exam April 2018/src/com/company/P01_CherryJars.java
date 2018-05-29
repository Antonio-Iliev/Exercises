package com.company;

import java.util.Scanner;

public class P01_CherryJars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jarCompote = Integer.parseInt(scanner.nextLine()) + 1;
        int jarJam = Integer.parseInt(scanner.nextLine()) + 1;

        double cheryCompote = (jarCompote * 0.3) * 1.05;
        double cheryJam = (jarJam * 0.65) * 1.1;
        double totalCheryPrice = (cheryCompote + cheryJam) * 3.2;

        System.out.printf("%.2f", totalCheryPrice);


    }
}
