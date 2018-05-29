package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MaxSumofKelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        list.sort(Comparator.naturalOrder());
        int sum = 0;
        for (int i = list.size() - 1; i > list.size() - 1 - k; i--) {
            // System.out.println(list.get(i));

            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
