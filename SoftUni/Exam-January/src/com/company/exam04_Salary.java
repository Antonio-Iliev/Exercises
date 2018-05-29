package com.company;

import java.util.Scanner;

public class exam04_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salaryBGN = Double.parseDouble(scanner.nextLine());
        int servTime = Integer.parseInt(scanner.nextLine());
        String unionMember = scanner.nextLine().toLowerCase();

        double currentSalary = salaryBGN;
        double brackSalary = 0;
        int counter = 0;

        switch (unionMember) {
            case "yes":
                while (currentSalary <= 5000) {
                    currentSalary *= 1.06;
                    counter++;

                    if (counter % 5 == 0) {
                        currentSalary += 100;
                    }

                    if (counter % 10 == 0) {
                        currentSalary += 100;
                    }

                    if (counter % 5 != 0 || counter % 10 != 0) {
                        currentSalary *= 0.99;
                    }

                    if (counter == servTime && currentSalary < 5000) {
                        brackSalary = currentSalary;
                    }
                }
                break;
            case "no":
                while (currentSalary <= 5000) {
                    currentSalary *= 1.06;
                    counter++;

                    if (counter % 5 == 0) {
                        currentSalary += 100;
                    }

                    if (counter % 10 == 0) {
                        currentSalary += 100;
                    }

                    if (counter == servTime && currentSalary < 5000) {
                        brackSalary = currentSalary;
                    }
                }
                break;
        }


        if (brackSalary > 0) {
            System.out.printf("Current salary: %.2f\n" +
                            "%d more years to max salary.\n",
                    brackSalary, (counter - 1) - servTime);
        } else {
            System.out.println("Current salary: 5000.00\n" +
                    "0 more years to max salary.\n");
        }
    }
}
