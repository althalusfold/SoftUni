import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            identifyDataType(input);
        }
    }
    private static void identifyDataType(String input) {
        if (isInteger(input)) {
            System.out.printf("%s is integer type%n", input);
        } else if (isDouble(input)) {
            System.out.printf("%s is floating point type%n", input);
        } else if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
            System.out.printf("%s is boolean type%n", input);
        } else if (input.length() == 1) {
            System.out.printf("%s is character type%n", input);
        } else {
            System.out.printf("%s is string type%n", input);
        }
    }
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
