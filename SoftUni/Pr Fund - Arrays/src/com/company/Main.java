package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] intArray = {300, 200, 400, 100, 600, 800};

        Arrays.sort(intArray);

        int[] newArray = Arrays.copyOf(intArray, 1);
        int[] newArray2 = Arrays.copyOfRange(intArray, 0, intArray.length);


        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray2));

        int sum = Arrays.stream(intArray).sum();

        System.out.println(sum);


    }
}
