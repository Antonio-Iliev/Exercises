package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            myList.add(scanner.nextInt());
        }

        myList.sort(Comparator.naturalOrder());

        int count = 0;
        int position = 0;
        int maxLength = 0;

        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i - 1) == myList.get(i)) {
                count++;
            } else {
                count = 0;
            }

            if (count > maxLength) {
                maxLength = count;
                position = i;
            }
            System.out.println("i-1= " + myList.get(i - 1) + ", " + "i= " + myList.get(i));
        }

        System.out.println(Arrays.toString(myList.toArray()));

        System.out.printf("%d (%d times)", myList.get(position), maxLength + 1);
    }
}
