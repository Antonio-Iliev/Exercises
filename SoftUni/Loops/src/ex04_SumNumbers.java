import java.util.Scanner;

public class ex04_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }

        System.out.println(sum);
    }
}
