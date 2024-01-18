
package seminar2.pkg1;

import java.util.Scanner;

public class Seminar21
{
    
      public static void main(String[] args) 
    {
    gradeCheck();
    tempCheck();
    }
      public static void gradeCheck()
      {          
          Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter number from 1 to 3 1-A; 2-B; 3-C");
          int grade = keyboard.nextInt();
        switch(grade)
        {
            case 1:
                System.out.println("Excellent!");
                 break;
            case 2:
                System.out.println("Good!");
                 break;    
            case 3:
                System.out.println("Failed!");
                 break; 
            default:
                System.out.println("Invalid sellection!");
        }     
      }
      public static void tempCheck()
      {
          Scanner keyboard = new Scanner(System.in);
            System.out.println("Please input temperature: ");
          float temp = keyboard.nextFloat();
      
             if (temp < 10)
         {
            System.out.println("Its cold take a jacket! ");
         }
             else if (temp >= 10 && temp <=26)
         {
            System.out.println("Have a plesant day!");
         }
             else
         {
            System.out.println("Take sun cream it is too hot!");
         }
      }
}
