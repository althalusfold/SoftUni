import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float moneyGBP = scanner.nextFloat();
        System.out.printf("%.3f", moneyGBP*1.36);
    }
}
