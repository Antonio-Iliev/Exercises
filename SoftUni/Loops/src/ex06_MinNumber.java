import java.util.Scanner;

public class ex06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (minValue > inputNumber) {
                minValue = inputNumber;
            }

        }

        System.out.println(minValue);

    }
}
