import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(!(input = scanner.nextLine()).equals("END")) {
            int number = Integer.parseInt(input);
            palindromeCheck(number);
        }
    }
    public static void palindromeCheck(int n){
        String number = String.valueOf(n);
        StringBuilder reversedNumber = new StringBuilder(number).reverse();

        if (number.equals(reversedNumber.toString())) {
            // It's a palindrome
            System.out.println("true");
        } else {
            System.out.println("false");
            // It's not a palindrome
        }
    }
}
