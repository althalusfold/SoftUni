import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int forthNum = scanner.nextInt();
        System.out.printf("%d", (firstNum + secondNum)/thirdNum * forthNum);
    }
}
