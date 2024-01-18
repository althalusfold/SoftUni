package Program;


import static Program.SUMOF.*;
import static Program.evenDigitSum.getEvenDigitSum;
import static Program.isPalindrome.isPalindrome;
import static Program.sharedDigit.hasSharedDigit;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println("This calculate SUM of first and last digit!");
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(10);
        sumFirstAndLastDigit(15);
        sumFirstAndLastDigit(30);
        sumFirstAndLastDigit(24);
        sumFirstAndLastDigit(18);
        sumFirstAndLastDigit(252);
        System.out.println();

        System.out.println("This calculate SUM of even digits in a number!");
        getEvenDigitSum(1258749);
        getEvenDigitSum(12749);
        getEvenDigitSum(1255559);
        getEvenDigitSum(14488749);
        getEvenDigitSum(1259);
        getEvenDigitSum(224455);
        System.out.println();

        System.out.println("This checks if two numbers share a digit!");
        hasSharedDigit(14,22);
        hasSharedDigit(15,12);
        hasSharedDigit(55,15);
        hasSharedDigit(85,5);
        hasSharedDigit(12,222);
        System.out.println();

        System.out.println("This checks if a number is a Palindrome!");
        isPalindrome(121);
        isPalindrome(1221);
        isPalindrome(123);
        isPalindrome(12321);
    }
}


