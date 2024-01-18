import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short numbers = scanner.nextShort();
        BigDecimal numbersToAdd = BigDecimal.valueOf(0.0);
        BigDecimal sum = BigDecimal.valueOf(0);
        for(short i = 0; i < numbers; i++){
            numbersToAdd = scanner.nextBigDecimal();
            sum = sum.add(numbersToAdd);
        }
        System.out.println(sum);
    }
}
