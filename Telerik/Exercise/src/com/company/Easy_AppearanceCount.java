package com.company;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class Easy_AppearanceCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String notUsedAnywhere = reader.readLine();

        double[] array = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToDouble(Double::parseDouble)
                .toArray();

        double numbToCheck = Double.parseDouble(reader.readLine());

        int counter = 0;

        for (double number : array) {
            if (number == numbToCheck){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
