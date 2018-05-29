package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Височина на правоъгълника: ");
        int a = Integer.parseInt(console.nextLine());
        System.out.print("Ширина на правоъгълника: ");
        int b = Integer.parseInt(console.nextLine());
        System.out.print("Лицето на правоъгълника е: " + a * b);
    }
}
