package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_GeometryCalculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String figureType = "";

        try {
            figureType = reader.readLine().toLowerCase();
        } catch (IOException e) {
            System.out.println("Not a string");
        }

        double parameter1 = 0;
        double parameter2 = 0;

        switch (figureType) {
            case "triangle":
            case "rectangle":

                try {
                    parameter1 = Double.parseDouble(reader.readLine());
                    parameter2 = Double.parseDouble(reader.readLine());
                } catch (IOException e) {
                    System.out.println("Not a string");
                }
                break;

            case "square":
            case "circle":

                try {
                    parameter1 = Double.parseDouble(reader.readLine());
                } catch (IOException e) {
                    System.out.println("Not a string");
                }
                break;
        }


        switch (figureType) {
            case "triangle":
                System.out.printf("%.2f", TriangleArea(parameter1, parameter2));
                break;
            case "rectangle":
                System.out.printf("%.2f", RectangleArea(parameter1, parameter2));
                break;
            case "square":
                System.out.printf("%.2f", SquareArea(parameter1));
                break;
            case "circle":
                System.out.printf("%.2f", CircleArea(parameter1));
                break;
        }


    }

    static double TriangleArea(double side, double heigth) {
        return (heigth * side) / 2;
    }

    static double RectangleArea(double width, double height) {
        return width * height;
    }

    static double SquareArea(double side) {
        return side * side;
    }

    static double CircleArea(double radius) {
        return Math.PI * (radius * radius);
    }
}
