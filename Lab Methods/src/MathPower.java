import java.io.FilterOutputStream;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", NumberToThePower(firstNumber, secondNumber));

    }
    public static double NumberToThePower(double numberOne, double numberTwo){

        return Math.pow(numberOne,numberTwo);
    }
}
