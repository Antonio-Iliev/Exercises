import java.util.Scanner;

public class ex10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int sumNumbers = 0;

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());

            sumNumbers += inputNumber;

            if (maxValue < inputNumber) {
                maxValue = inputNumber;
            }

        }

        if (((maxValue * 2) - sumNumbers) == 0) {
            System.out.printf("Yes%nSum = %d", maxValue);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs((maxValue * 2 - sumNumbers)));
        }

    }
}
