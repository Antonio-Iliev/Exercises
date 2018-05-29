import java.util.Scanner;

public class ex12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int value = 0;
        int diff = 0;
        int i = 0;

        for (i = 0; i < n; i++) {
            int inputNub1 = Integer.parseInt(scanner.nextLine());
            int inputNub2 = Integer.parseInt(scanner.nextLine());


            if (sum == (inputNub1 + inputNub2)) {
                value = sum;
                sum = inputNub1 + inputNub2;

            } else {
                diff = Math.abs(sum - (inputNub1 + inputNub2));
                sum = inputNub1 + inputNub2;

            }
        }

        if (value == sum || i == 1) {
            System.out.println("Yes, value=" + sum);
        } else {
            System.out.println("No, maxdiff=" + diff);
        }

    }
}
