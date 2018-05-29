package com.company;

import java.util.Scanner;

public class ex11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bilet = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double result = 0;

        switch (bilet) {
            case "Premiere":
                result = row * columns * 12;
                break;
            case "Normal":
                result = row * columns * 7.50;
                break;
            case "Discount":
                result = row * columns * 5;

        }

        System.out.printf("%.2f%nleva", result);
    }
}
