import java.util.Scanner;

public class ex05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (maxValue < inputNumber) {
                maxValue = inputNumber;
            }

        }

        System.out.println(maxValue);

    }
}
