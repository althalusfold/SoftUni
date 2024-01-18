import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        // Input: Enter the value of n
        int n = scanner.nextInt();

        // Process each number from 1 to n
        for (int i = 1; i <= n; i++) {
            boolean isSpecial = checkSpecial(i);
            if(isSpecial) {
                result = "True";
                System.out.printf("%d -> %s%n", i, result);
            }else {
                result = "False";
                System.out.printf("%d -> %s%n", i, result);
            }
        }
    }

    // Function to check if a number is special
    private static boolean checkSpecial(int number) {
        int sumOfDigits = 0;

        // Calculate the sum of digits
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        // Check if the sum is 5, 7, or 11
        return sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11;
    }
}
