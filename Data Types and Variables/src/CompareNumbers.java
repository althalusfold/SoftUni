import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of lines
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            // Input: Two numbers separated by a space
            String number = scanner.nextLine();

            StringBuilder leftNumberStr = new StringBuilder();
            StringBuilder rightNumberStr = new StringBuilder();
            int j = 0;

            while (j < number.length() && number.charAt(j) != ' ') {
                leftNumberStr.append(number.charAt(j));
                j++;
            }
            j++;

            while (j < number.length()) {
                rightNumberStr.append(number.charAt(j));
                j++;
            }

            long leftNumber = Long.parseLong(leftNumberStr.toString());
            long rightNumber = Long.parseLong(rightNumberStr.toString());

            // Compare numbers and calculate sum of digits
            long bigInt = Math.max(leftNumber, rightNumber);
            int sumOfDigits = 0;
            if(bigInt < 0) {
                bigInt *= -1;
            }
            while (bigInt > 0) {
                sumOfDigits += bigInt % 10;
                bigInt /= 10;
            }
            System.out.println(sumOfDigits);
        }
    }
}
