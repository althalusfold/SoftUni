package Calculations;

import java.util.Scanner;
public class Calculations
{  
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Give number 1:");
        double num1 = input.nextDouble();
        System.out.print("Give number 2:");
        double num2 = input.nextDouble();
        double substract = num1 + num2;
        double devide = num1 - num2;
        double multiply = num1 * num2;
        double division = num1 / num2;
        System.out.println("The result of substraction is: "+substract);      
        System.out.println("The result of devide is: "+devide);
        System.out.println("The result of multiplification is: "+multiply);
        System.out.println("The result of division is: "+division);
    }
    
}
