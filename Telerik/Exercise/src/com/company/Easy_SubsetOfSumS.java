package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Easy_SubsetOfSumS {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.parseInt(reader.readLine());
        int array[] = Arrays.stream(reader.readLine().split(" "))
                .filter(value -> value != null && value.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        if (isSubsetSum(array, array.length, sum))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    static boolean isSubsetSum(int set[], int n, int sum) {

        boolean subset[][] = new boolean[sum + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1]) {
                    subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
                }
            }
        }

        return subset[sum][n];
    }

}
