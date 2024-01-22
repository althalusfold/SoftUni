
package CashMachine;

import java.util.Scanner;

public class Main     
{
    static Scanner keyboard = new Scanner(System.in); 
    static long balance = 0;
    static int option = 0;
    public static void main(String[] args)
    {
        options();
    }        
    
   static void options()
        {
        System.out.println("Select action: ");
        System.out.println("1-Add Money ");
        System.out.println("2-Withdraw Money ");
        System.out.println("3-Check Ballance ");        
        System.out.println("4-Cancel/Finnish transaction! ");
        System.out.println("Any other seletion cancel the transaction! ");
        System.out.println("Enter selection: ");
               
            for (option=1; option<=4; option++)
            {      
            
            option = keyboard.nextInt();
            
            switch(option)
                {
                case 1:
                    addMoney();
                    continueTransaction();
                    return;
                case 2:
                    withdraw();
                    continueTransaction();
                    return;   
                case 3:
                    checkBalance();
                    continueTransaction();
                    return;
                    default:
                    System.out.println("Thank you, have a nice day!");
                    return;
                }           
            }
        } 
    static void addMoney()
    {
        System.out.println("Enter amount to add: ");
                        
            balance += keyboard.nextDouble();
             
        checkBalance();
        
    }
    
    static void withdraw()
    {
        System.out.println("Enter amount to withdraw: ");
            
            double tempBalance = keyboard.nextDouble();
            if (tempBalance > balance)
        {
            System.out.println("Your balance is not enought! Please enter smaller anount! Your balance is: " + balance + " £");
        }
            else
        {
            balance = (long) (balance - tempBalance);
            checkBalance();
        }        
    }     
    
     static void checkBalance()
    {
        System.out.println("---------------------------------------");
        System.out.println("Your balance is: " + balance + "£");
        System.out.println("---------------------------------------");
    }
     
     static void continueTransaction()
    {
        System.out.println("Would you like to continue? If YES press 5! Any other number ends the transaction!!! ");
        option = keyboard.nextInt();
        while(option==5)
        {
        options();
        }
        while (option!=5 && option!=4)
        {
            System.out.println("Thank you, have a nice day! ");
            return;
        }
    }
}