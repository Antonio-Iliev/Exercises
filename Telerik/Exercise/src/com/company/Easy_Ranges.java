package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Easy_Ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[][] array = new int[3][numbers];

        System.arraycopy(inputArray, 0, array[0], 0, numbers);

        Arrays.sort(inputArray);

        System.arraycopy(inputArray, 0, array[1], 0, numbers);

        for (int i = 0; i < array[0].length; i++) {
            array[2][i] = numbers - i;
        }


        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[0][i] == array[1][j]) {
                    System.out.print(array[2][j] + " ");
                }
            }
        }

    }
}
