import java.math.BigInteger;
import java.util.Scanner;

public class SumBigInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstBigInt = new BigInteger(scanner.nextLine());
        BigInteger secondBigInt = new BigInteger(scanner.nextLine());

        BigInteger total = firstBigInt.add(secondBigInt);

        System.out.println(total);
    }
}
