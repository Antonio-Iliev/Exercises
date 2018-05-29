package com.company;

import java.util.Scanner;

public class exam01_Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nachalnoTesto = Integer.parseInt(scanner.nextLine());
        int breadWeight = Integer.parseInt(scanner.nextLine());
        double priceBread = Double.parseDouble(scanner.nextLine());
        int amountBread = Integer.parseInt(scanner.nextLine());
        int amountCake = Integer.parseInt(scanner.nextLine());


        double incomeBread = amountBread * priceBread;

        double incomeCake = (priceBread * 1.25) * amountCake;


        double testoForBread = amountBread * breadWeight;
        double testoForCake = (breadWeight * 0.8) * amountCake;


        double costTesto = ((nachalnoTesto + testoForBread) / 1000) * 4;

        double pureIncome = incomeBread + incomeCake - costTesto;

        double usedTesto = testoForBread + testoForCake;


        System.out.printf("Pure income: %.2f lv.%n" +
                "Dough used: %d g.", pureIncome, (int) Math.round(usedTesto));


    }
}
