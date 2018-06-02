package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Easy_SimilarArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        for (int i = 0; i < num1; i++) {
            arrayList1.add(scanner.nextInt());
        }

        int num2 = scanner.nextInt();

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i = 0; i < num2; i++) {
            arrayList2.add(scanner.nextInt());
        }

        Collections.sort(arrayList1);
        Collections.sort(arrayList2);

        for (int i = 0; i < arrayList1.size() - 1; i++) {
            if (arrayList1.get(i).equals(arrayList1.get(i + 1))) {
                arrayList1.remove(i);
                i--;
            }
        }

        for (int i = 0; i < arrayList2.size() - 1; i++) {
            if (arrayList2.get(i).equals(arrayList2.get(i + 1))) {
                arrayList2.remove(i);
                i--;
            }
        }

        if (arrayList1.equals(arrayList2)) {
            System.out.println(arrayList1.size());
        } else {
            for (int i = 0; i < arrayList1.size(); i++) {
                for (int j = 0; j < arrayList2.size(); j++) {
                    if (arrayList1.get(i).equals(arrayList2.get(j))) {
                        arrayList1.remove(i);
                        arrayList2.remove(j);
                        i--;
                        break;
                    }
                }
            }

            for (int numb : arrayList1) {
                System.out.print(numb + " ");
            }
        }

    }
}
