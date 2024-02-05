import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        factorialAndDivision(firstNumber, secondNumber);

    }
    public static void factorialAndDivision(int a, int b){
        double firstFactorial = 1;
        double secondFactorial = 1;
        for (int i = 1; i <= a; i++) {
            firstFactorial *= i;
        }
        for (int i = 1; i <= b; i++) {
            secondFactorial *= i;
        }
        double result = firstFactorial / secondFactorial;
        System.out.printf("%.2f", result);
    }
}
