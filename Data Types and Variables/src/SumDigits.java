import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (true){
          int divisible =  number % 10;
          sum += divisible;
          number /= 10;
          if(number < 1){
              break;
          }
        }
        System.out.println(sum);
    }
}
