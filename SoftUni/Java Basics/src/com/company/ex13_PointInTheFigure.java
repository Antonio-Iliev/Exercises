package com.company;

import java.util.Scanner;

public class ex13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        // figura 1
        int x1Rec01 = 0;
        int y1Rec01 = 0;
        int x2Rec01 = h * 3;
        int y2Rec01 = h;

        //figura 2
        int x1Rec02 = h;
        int y1Rec02 = h;
        int x2Rec02 = h * 2;
        int y2Rec02 = h * 4;

        // proverki

        boolean inRectangle01 = x > x1Rec01 && x < x2Rec01 && y > y1Rec01 && y < y2Rec01;
        boolean inRectangle02 = x > x1Rec02 && x < x2Rec02 && y > y1Rec02 && y < y2Rec02;
        boolean onInsideBorder = y == y1Rec02 && x > x1Rec02 && x < x2Rec02;

        boolean leftRec01 = x == x1Rec01 && y >= y1Rec01 && y <= y2Rec01;
        boolean rightRec01 = x == x2Rec01 && y >= y1Rec01 && y <= y2Rec01;
        boolean topRec01 = y == y2Rec01 && x >= x1Rec01 && x <= x2Rec01;
        boolean bottomRec01 = y == y1Rec01 && x >= x1Rec01 && x <= x2Rec01;

        boolean leftRec02 = x == x1Rec02 && y >= y1Rec02 && y <= y2Rec02;
        boolean rightRec02 = x == x2Rec02 && y >= y1Rec02 && y <= y2Rec02;
        boolean topRec02 = y == y2Rec02 && x >= x1Rec02 && x <= x2Rec02;


        if (inRectangle01 || inRectangle02 || onInsideBorder) {
            System.out.println("inside");
        } else if (leftRec01 || rightRec01 || topRec01
                || bottomRec01 || leftRec02 || rightRec02 || topRec02) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }

    }
}

