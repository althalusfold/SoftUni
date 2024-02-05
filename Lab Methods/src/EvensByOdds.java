import java.util.Scanner;

public class EvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(Math.abs(number)));
    }
    private static int getMultipleOfEvensAndOdds(int n){
        int evenSum = getSumOfEvenNumbers(n);
        int oddSum = getSumOfOddNumbers(n);
        return evenSum*oddSum;
    }
    public static int getSumOfEvenNumbers(int n){
        int evenSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            n /= 10;
        }
        return evenSum;
    }

    public static int getSumOfOddNumbers(int n){
        int oddSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            n /= 10;
        }
        return oddSum;
    }
}
