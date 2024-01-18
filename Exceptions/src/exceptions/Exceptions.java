
package exceptions;

import java.util.Scanner;

public class Exceptions 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] char_array ={'f','m','M','F'};
        while (true)
        {
            System.out.println("Input array index: ");
            int i = keyboard.nextInt();keyboard.nextLine();
            
            try
            {
                System.out.println("The value at the provided index is: " + number_array[i]);
            }
            catch(ArrayIndexOutOfBoundsException error)
            {
                System.out.println("Wrong input!");
            }            
        }
    }     
}
