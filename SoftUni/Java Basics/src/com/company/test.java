package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int maxNub = Math.max(Math.max(x, y), z);

        int minNub = Math.min(Math.min(x, y), z);

        int midNub = x + y + z - maxNub - minNub;

        System.out.printf("%d %d %d", minNub, midNub, maxNub);
    }
}
