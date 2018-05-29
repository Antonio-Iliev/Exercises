package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int raspberries = Integer.valueOf(reader.readLine());
        int strawberries = Integer.valueOf(reader.readLine());
        int cherries = Integer.valueOf(reader.readLine());
        double juiceAllowed = Double.valueOf(reader.readLine());
        double juice = 0;
        int ras = 0;
        int str = 0;
        int chr = 0;

        for (int i = 0; i <= raspberries; i++) {
            for (int j = 0; j <= strawberries; j++) {
                for (int k = 0; k <= cherries; k++) {
                    double juiceMade = i * 4.5 + j * 7.5 + k * 15.0;
                    if (juiceMade <= juiceAllowed && juice < juiceMade) {
                        juice = juiceMade;
                        chr = k;
                        ras = i;
                        str = j;
                    }
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(String.format("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.", ras, str, chr, df.format(juice)));


    }
}
