import java.util.Scanner;

public class ex07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n * 2; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            if (i < n) {
                leftSum += input;
            } else {
                rightSum += input;
            }

        }

        if ((leftSum - rightSum) == 0) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }

    }
}
