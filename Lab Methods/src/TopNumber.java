import java.util.Scanner;
public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int num = 1; num <= n; num++) {
            if (isTopNumber(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isTopNumber(int num) {
        int sumOfDigits = 0;
        boolean hasOddDigit = false;

        while (num > 0) {
            int digit = num % 10;
            sumOfDigits += digit;

            if (digit % 2 != 0) {
                hasOddDigit = true;
            }
            num /= 10;
        }
        return sumOfDigits % 8 == 0 && hasOddDigit;
    }
}



//Read an integer n from the console. Find all top numbers in the range [1 … n] and print them. A top number holds the following properties:
//        •	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//        •	Holds at least one odd digit, e.g. 232, 707, 87578.
