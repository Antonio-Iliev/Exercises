package com.company;

import java.util.Scanner;

public class exam04_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        double totalKM = km;

        for (int i = 0; i < n; i++) {
            int percentages = Integer.parseInt(scanner.nextLine());

            km += km * percentages / 100;
            totalKM += km;


        }

        double result = Math.abs(1000 - totalKM);

        if (totalKM >= 1000) {
            System.out.printf("You've done a great job running %d more kilometers!",
                    (int) Math.ceil(result)
            );
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %d more kilometers",
                    (int) Math.ceil(result)
            );
        }
    }
}
