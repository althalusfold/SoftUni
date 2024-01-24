import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two lines containing floating-point numbers
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        // Precision for comparison
        double eps = 0.000001;

        // Compare the floating-point numbers
        if (Math.abs(a - b) < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
