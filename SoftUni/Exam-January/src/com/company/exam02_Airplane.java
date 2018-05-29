package com.company;

import java.util.Scanner;

public class exam02_Airplane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        int arrivalTimeH = (time / 60) + h;
        int arrivalTimeM = (time % 60) + m;

        if (arrivalTimeM >= 60) {
            arrivalTimeH++;
            arrivalTimeM -= 60;
        }

        if (arrivalTimeH >= 24) {
            arrivalTimeH -= 24;
        }

        System.out.printf("%dh %dm", arrivalTimeH, arrivalTimeM);
    }
}
