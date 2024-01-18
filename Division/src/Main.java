import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisibleBy = 0;
        boolean divisible = true;

        if(number % 6 == 0 && number % 10 != 0 ){
            divisibleBy = 6;
        }else if(number % 10 == 0){
            divisibleBy = 10;
        }else if(number % 2 == 0 && number < 10) {
            divisibleBy = 2;
        }else if(number % 7 == 0) {
            divisibleBy = 7;
        }else if(number % 3 == 0) {
            divisibleBy = 3;
        }else {
            divisible = false;
        }
        if (divisible) {
            System.out.println("The number is divisible by " + divisibleBy);
        }
        else {
            System.out.println("Not divisible");
        }
    }
}


//You will be given an integer, and you have to print on the console whether that number
// is divisible by the following numbers: 2, 3, 6, 7, 10. You should always take the bigger
// division. If the number is divisible by both 2 and 3 it is also divisible by 6,
// and you should print only the division by 6. If a number is divisible
// by 2 it is sometimes also divisible by 10, and you should print the division by 10.
// If the number is not divisible by any given number, print "Not divisible". Otherwise,
// print "The number is divisible by {number}".
//Examples
//Input	Output
//30	The number is divisible by 10
//15	The number is divisible by 3
//12	The number is divisible by 6
//1643	Not divisible