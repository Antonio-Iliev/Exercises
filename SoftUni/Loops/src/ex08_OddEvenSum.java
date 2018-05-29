import java.util.Scanner;

public class ex08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                even += input;
            } else {
                odd += input;
            }
        }

        if ((even - odd) == 0) {
            System.out.println("Yes Sum = " + even);
        } else {
            System.out.println("No Diff = " + Math.abs(even - odd));
        }
    }
}
