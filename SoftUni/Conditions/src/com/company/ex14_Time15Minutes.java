package com.company;

import java.util.Scanner;

public class ex14_Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        // преобразува повечето мин. в 1 допълнителне час.
        if (minutes >= 60) {
            hours = hours + 1;
            minutes = minutes - 60;
        }

        // проверка дали се превърта стрелката на часа.
        if (hours == 24) {
            hours = 0;
        }


        // проверява дали да се добави 0 пред мин.
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
