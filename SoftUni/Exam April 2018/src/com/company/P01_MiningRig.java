package com.company;

import java.util.Scanner;

public class P01_MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gpuPrice = Integer.parseInt(scanner.nextLine());
        int hubPrice = Integer.parseInt(scanner.nextLine());
        double electricityPreGPUperDay = Double.parseDouble(scanner.nextLine());
        double incomePreGPUperDay = Double.parseDouble(scanner.nextLine());


        int costAllGpu = gpuPrice * 13;
        int costHubs = hubPrice * 13;

        double totalPrice = costHubs + costAllGpu + 1000;

        double totalIncomePerDay = (incomePreGPUperDay - electricityPreGPUperDay) * 13;

        double daysNeeded = Math.ceil(totalPrice / totalIncomePerDay);

        System.out.printf("%.0f\n%.0f", totalPrice, daysNeeded);


    }
}
