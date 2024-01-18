import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                System.out.println("Please write an even number.");
            }else{
                System.out.print("The number is: " + Math.abs(number));
                break;
            }
        }
    }
}
