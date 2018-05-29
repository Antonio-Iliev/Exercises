package com.company;

import java.util.Scanner;

public class P06_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int element1Numb = Integer.parseInt(scanner.nextLine());
        char element2Char = (char) scanner.nextLine().toUpperCase().charAt(0);
        char element3Char = (char) scanner.nextLine().toLowerCase().charAt(0);
        int element4Numb = Integer.parseInt(scanner.nextLine());
        int element5Numb = Integer.parseInt(scanner.nextLine());
        int element6Numb = Integer.parseInt(scanner.nextLine());
        int iteration = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 1; i <= element1Numb; i++) {
            for (char j = 'A'; j <= element2Char; j++) {
                for (char k = 'a'; k <= element3Char; k++) {
                    for (int l = 1; l <= element4Numb; l++) {
                        for (int m = 1; m <= element5Numb; m++) {
                            for (int n = 1; n <= element6Numb; n++) {

                                count++;
                                if (count == iteration) {
                                    System.out.printf("%d%c%c%d%d%d \n", i, j, k, l, m, n);
                                    return;
                                }

                            }
                        }
                    }
                }
            }
        }

        System.out.println("No password on this position");
    }
}
