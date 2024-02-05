import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f", calculate(firstNumber, operator, secondNumber));
    }

    private static double calculate(int a, String action, int b){
        double result = 0;

        switch (action){
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                result = a/b;
                break;
        }
        return result;
    }
}
