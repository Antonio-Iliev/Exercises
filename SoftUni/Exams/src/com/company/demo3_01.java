package com.company;

import java.util.Scanner;

public class demo3_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double CPUprice = Double.parseDouble(scanner.nextLine());
        double GPUprice = Double.parseDouble(scanner.nextLine());
        double RAMprice = Double.parseDouble(scanner.nextLine());
        int amountRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        CPUprice = (CPUprice - (CPUprice * discount)) * 1.57;
        GPUprice = (GPUprice - (GPUprice * discount)) * 1.57;
        RAMprice = (RAMprice * amountRAM) * 1.57;


        double priceInBGN = CPUprice + GPUprice + RAMprice;


        System.out.printf("Money needed - %.2f leva.", priceInBGN);

    }
}
