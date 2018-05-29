import java.util.Scanner;

public class ex11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;
        int oddMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        int evenMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int inputNumb = Integer.parseInt(scanner.nextLine());

            if (Math.abs(inputNumb) % 2 == 0) {
                evenSum += inputNumb;
                if (evenMax < inputNumb) {
                    evenMax = inputNumb;
                }
                if (evenMin > inputNumb) {
                    evenMin = inputNumb;
                }
            } else {
                oddSum += inputNumb;
                if (oddMax < inputNumb) {
                    oddMax = inputNumb;
                }
                if (oddMin > inputNumb) {
                    oddMin = inputNumb;
                }
            }
        }

        System.out.println("OddSum=" + oddSum);
        if (oddMin != Integer.MAX_VALUE) {
            System.out.println("OddMin=" + oddMin);
        } else {
            System.out.println("OddMin=No");
        }
        if (oddMax != Integer.MIN_VALUE) {
            System.out.println("OddMax=" + oddMax);
        } else {
            System.out.println("OddMax=No");
        }
        System.out.println("EvenSum=" + evenSum);
        if (evenMin != Integer.MAX_VALUE) {
            System.out.println("EvenMin=" + evenMin);
        } else {
            System.out.println("EvenMin=No");
        }
        if (evenMax != Integer.MIN_VALUE) {
            System.out.println("EvenMax=" + evenMax);
        } else {
            System.out.println("EvenMax=No");
        }

    }
}
