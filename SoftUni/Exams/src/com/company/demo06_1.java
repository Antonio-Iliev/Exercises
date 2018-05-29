package com.company;

import java.util.Scanner;

public class demo06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first1 = scanner.nextLine().charAt(0);
        int first2 = Integer.parseInt(scanner.nextLine());
        char middle1 = scanner.nextLine().charAt(0);
        int middle2 = Integer.parseInt(scanner.nextLine());
        char end1 = scanner.nextLine().charAt(0);
        int end2 = Integer.parseInt(scanner.nextLine());

        boolean checker1 = (int) first1 >= 32 && (int) first1 <= 126
                && (int) middle1 >= 32 && (int) middle1 <= 126
                && (int) end1 >= 32 && (int) end1 <= 126;

        boolean checker2 = first2 >= 1 && first2 <=93
                && middle2 >= 1 && middle2 <=93
                && end2 >= 1 && end2 <=93;


        if (checker1 && checker2) {

            int valueFirst = (int) first1 + first2;
            int valueMiddle = (int) middle1 + middle2;
            int valueEnd = (int) end1 + end2;

            String print = Character.toString((char) valueFirst)
                    + Character.toString((char) valueMiddle)
                    + Character.toString((char) valueEnd);


            switch (print) {
                case "777":
                    System.out.printf("%c%c%c%n", (char) valueFirst, (char) valueMiddle, (char) valueEnd);
                    System.out.println("*** JACKPOT ***");
                    break;
                case "@@@":
                    System.out.printf("%c%c%c%n", (char) valueFirst, (char) valueMiddle, (char) valueEnd);
                    System.out.println("!!! YOU LOSE EVERYTHING !!!");
                    break;
                default:
                    System.out.printf("%c%c%c",
                            (char) valueFirst, (char) valueMiddle, (char) valueEnd);
                    break;
            }
        }


    }
}

