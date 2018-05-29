package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P18_SequenceOfCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[n];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }


        while (true) {
            String inputCommand = scanner.next().toLowerCase();
            int indexPosition = 0;
            int valueNum = 0;

            switch (inputCommand) {
                case "add":
                    indexPosition = scanner.nextInt();
                    valueNum = scanner.nextInt();
                    System.out.println(AddCommand(numArray, indexPosition, valueNum));


                    break;
                case "multiply":
                    indexPosition = scanner.nextInt();
                    valueNum = scanner.nextInt();
                    System.out.println(MultiCommand(numArray, indexPosition, valueNum));

                    break;
                case "subtract":
                    indexPosition = scanner.nextInt();
                    valueNum = scanner.nextInt();
                    System.out.println(SubtractCommand(numArray, indexPosition, valueNum));

                    break;
                case "lshift":
                    System.out.println(MoveFirstToLastPosition(numArray));
                    break;
                case "rshift":
                    System.out.println(MoveLastToFirstPosition(numArray));
                    break;
                case "stop":
                    return;
            }

        }


    }

    static String AddCommand(int[] inputArray, int indexPos, int valueNum) {
        inputArray[indexPos - 1] += valueNum;
        return ReturnStringToPrint(inputArray);
    }

    static String MultiCommand(int[] inputArray, int indexPos, int valueNum) {
        inputArray[indexPos - 1] *= valueNum;

        return ReturnStringToPrint(inputArray);
    }

    static String SubtractCommand(int[] inputArray, int indexPos, int valueNum) {
        inputArray[indexPos - 1] -= valueNum;

        return ReturnStringToPrint(inputArray);
    }

    static String MoveFirstToLastPosition(int[] inputArray) {
        int firstNum = inputArray[0];

        for (int i = 0; i < inputArray.length - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[inputArray.length - 1] = firstNum;

        return ReturnStringToPrint(inputArray);
    }

    static String MoveLastToFirstPosition(int[] inputArray) {
        int lastNum = inputArray[inputArray.length - 1];

        for (int i = inputArray.length - 2; i >= 0; i--) {
            inputArray[i + 1] = inputArray[i];
        }
        inputArray[0] = lastNum;

        return ReturnStringToPrint(inputArray);
    }

    static String ReturnStringToPrint(int[] inputArray) {
        String toPrint = Arrays.toString(inputArray);
        toPrint = toPrint.substring(1, toPrint.length() - 1);
        toPrint = toPrint.replace(",", "");

        return toPrint;
    }
}
