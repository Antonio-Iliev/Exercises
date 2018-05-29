package com.company;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inNub1 = scanner.nextLine();
        String inNub2 = scanner.nextLine();

        int start0 = (int) inNub1.charAt(0);
        int start1 = (int) inNub1.charAt(1);
        int start2 = (int) inNub1.charAt(2);
        int start3 = (int) inNub1.charAt(3);

        int end0 = (int) inNub2.charAt(0);
        int end1 = (int) inNub2.charAt(1);
        int end2 = (int) inNub2.charAt(2);
        int end3 = (int) inNub2.charAt(3);


        for (int i = start0; i <= end0; i++) {
            for (int j = start1; j <= end1; j++) {
                for (int k = start2; k <= end2; k++) {
                    for (int l = start3; l <= end3; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ",
                                    (char) i, (char) j, (char) k, (char) l
                            );
                        }
                    }
                }
            }
        }
    }


}
