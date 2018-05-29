package com.company;

import java.util.Scanner;

public class pinchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        if (name.equals("Niki")) {
            System.out.println("Здравей джинджифилоф!");
        } else if (name.equals("Toni")) {
            System.out.println("Kак си баджевре?");
        } else if (name.equals("Leni")) {
            System.out.println("Гладни сме Ленчик!");
        } else {
            System.out.println("не те познаваме");
        }
    }
}
