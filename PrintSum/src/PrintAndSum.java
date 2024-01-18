import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i<= secondNumber; i++){
            System.out.printf("%d ",i);
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
