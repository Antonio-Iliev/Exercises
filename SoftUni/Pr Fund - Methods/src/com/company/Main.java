package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

//        String input = reader.readLine();
//
//        String[] strArray = input.split(" ");

        int[] intArray = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[0] + intArray[1]);


    }
}
