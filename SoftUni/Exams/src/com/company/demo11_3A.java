package com.company;

import java.util.Scanner;

public class demo11_3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());
        int itemCount = 0;
        int sumItems = 0;

        if (n >= 1 && n <= 7 && money >= 250) {

            for (int i = 0; i < n; i++) {
                String items = scanner.nextLine().toLowerCase();

                switch (items) {
                    case "ak47":
                        itemCount++;
                        sumItems += 2700;
                        break;
                    case "awp":
                        itemCount++;
                        sumItems += 4750;
                        break;
                    case "sg553":
                        itemCount++;
                        sumItems += 3500;
                        break;
                    case "grenade":
                        itemCount++;
                        sumItems += 300;
                        break;
                    case "flash":
                        itemCount++;
                        sumItems += 250;
                        break;
                    case "glock":
                        itemCount++;
                        sumItems += 500;
                        break;
                    case "bazooka":
                        itemCount++;
                        sumItems += 5600;
                        break;
                }
            }


        }

        if (n > 7) {
            System.out.println("Sorry, you can't carry so many things!");
        } else if (money >= sumItems && n >= 1) {
            System.out.printf("You bought all %d items! Get to work and defeat the bomb!", itemCount);
        } else if (money < sumItems && n >= 1) {
            System.out.printf("Not enough money! You need %d more money.", sumItems - money);
        }
    }
}
