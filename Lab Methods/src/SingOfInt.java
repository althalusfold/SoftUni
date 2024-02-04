import java.util.Scanner;

public class SingOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SignCheck(Integer.parseInt(scanner.nextLine()));
    }

    public static void SignCheck(int number){
        if(number < 0){
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        }else{
            System.out.print("The number 0 is zero.");
        }
    }
}
