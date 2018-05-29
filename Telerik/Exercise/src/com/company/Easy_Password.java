package com.company;

import java.util.Scanner;

public class Easy_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputNumb = new StringBuilder().append(scanner.next());
        int k = scanner.nextInt();

        int reverseNumb = Integer.parseInt(inputNumb.reverse().toString());

        int result = (reverseNumb / k) + (reverseNumb % k);

        System.out.println(result);
    }
}
