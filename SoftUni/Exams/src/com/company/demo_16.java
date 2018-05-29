package com.company;

import java.util.Scanner;

public class demo_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());
        int numb4 = Integer.parseInt(scanner.nextLine());

        boolean firstCheck = numb1 >= 10 && numb1 <= 90 && numb2 >= 10 && numb2 <= 90;
        boolean secondCheck = numb3 >= 1 && numb3 <= 9 && numb4 >= 1 && numb4 <= 9;
        boolean flag = true;

        int numberFinal1 = 0;
        int numberFinal2 = 0;

        if (firstCheck && secondCheck) {


            for (int i = numb1; i <= (numb1 + numb3); i++) {
                for (int j = numb2; j <= (numb2 + numb4); j++) {
                    if ((i == 11 || i == 13 || i == 17 || i == 19 || i == 23 || i == 29
                            || i == 31 || i == 37 || i == 41 || i == 43 || i == 47 || i == 53
                            || i == 59 || i == 61 || i == 67 || i == 71 || i == 73 || i == 79
                            || i == 83 || i == 89) && (j == 11 || j == 13 || j == 17
                            || j == 19 || j == 23 || j == 29
                            || j == 31 || j == 37 || j == 41 || j == 43 || j == 47 || j == 53
                            || j == 59 || j == 61 || j == 67 || j == 71 || j == 73 || j == 79
                            || j == 83 || j == 89)

                            ) {
                        System.out.printf("%d%d%n", i, j);
                    }
                }


            }


        }
    }
}
