package seminar2;
import java.util.Scanner;
public class Seminar2
{   
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Give number: ");
             float numb = keyboard.nextFloat();
        numb++;                             // Adding 1;
            System.out.println(numb);       // Printing on numb on screen;
        numb++;                             // Adding 1;
            System.out.println(numb);       // Printing on numb on screen;
        numb--;                             // Substracting 1;
            System.out.println(numb);       // Printing on numb on screen;
        numb--;                             // Substracting 1;
            System.out.println(numb);       // Printing on numb on screen;
       if(numb>=10)                         // Check if numb is bigger or qual to 10;
       {
           System.out.println(numb + " Number is bigger than or equal to 10!");
       }
       else if (numb >= 1 && numb < 10)     // Check if numb is bigger or qual to 1 and smaller than 10
       {
           System.out.println(numb + " Is smaller than 10 and equal or bigger than 1!");
       } 
       else 
       {
       System.out.println(numb + " Is smaller than 10 and bigger or equal to 1!");
       }
    }
}
