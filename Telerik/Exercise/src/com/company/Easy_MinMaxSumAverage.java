package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Easy_MinMaxSumAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        double[] arrayOfNumb = new double[n];

        for (int i = 0; i < arrayOfNumb.length; i++) {
            arrayOfNumb[i] = Double.parseDouble(reader.readLine());
        }

        Arrays.sort(arrayOfNumb);
        double sum = DoubleStream.of(arrayOfNumb).sum();
        double average = sum / n;

        System.out.printf(""
                        + "min=%.2f\n"
                        + "max=%.2f\n"
                        + "sum=%.2f\n"
                        + "avg=%.2f",
                arrayOfNumb[0], arrayOfNumb[arrayOfNumb.length - 1], sum, average);

    }
}
