package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Easy_Figures {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        double saidA = scanner.nextDouble();
        double saidB = scanner.nextDouble();
        double saidC = scanner.nextDouble();
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();

        double triangleBiggestSide = Math.max(Math.max(saidA, saidB), saidC);
        double rectangleBiggestSide = Math.max(width, length);

        double ribbon = 0;

        if (triangleBiggestSide <= rectangleBiggestSide) {
            ribbon = (saidA + saidB + saidC) + ((width + length) * 2);
            ribbon -= triangleBiggestSide*2;
        }else {
            ribbon = (saidA + saidB + saidC) + ((width + length) * 2);
            ribbon -= rectangleBiggestSide*2;
        }

        DecimalFormat format = new DecimalFormat("0.####");
        System.out.println(format.format(ribbon));
    }
}
