import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number for comparison

        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            result += factorial;
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
