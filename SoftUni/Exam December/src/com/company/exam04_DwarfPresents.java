package com.company;

import java.util.Scanner;

public class exam04_DwarfPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double giftsPrice = 0;

        for (int i = 0; i < n; i++) {
            String gifts = scanner.nextLine().toLowerCase();

            switch (gifts) {
                case "sand clock":
                    giftsPrice += 2.2;
                    break;
                case "magnet":
                    giftsPrice += 1.5;
                    break;
                case "cup":
                    giftsPrice += 5.0;
                    break;
                case "t-shirt":
                    giftsPrice += 10.0;
                    break;
            }

        }

        if (budget >= giftsPrice) {
            System.out.printf("Santa Claus has %.2f more leva left!", budget - giftsPrice);
        } else {
            System.out.printf("Santa Claus will need %.2f more leva.", giftsPrice - budget);
        }

    }
}
