import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberMatrix
{   //Напишете метод, който намира колко пъти дадено число се среща в даден масив. Напишете програма, която проверява дали този метод работи правилно.
    public static int MatrixNumbers(int number, int[]matrix)
    {
        int count = 0;
        for (int i : matrix)
        {
            if (i == number)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int length = input.nextInt();

        int[] matrix = new int[length];

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.printf("Enter %d element: ", i);
            matrix[i] = input.nextInt();
        }
        System.out.println("Enter number to look for in matrix:");
        int number = input.nextInt();
        System.out.printf("Number %d is met: %d times.",number,MatrixNumbers(number,matrix));
        System.out.println("\nMatrix values are: "+ Arrays.toString(matrix));
    }
}
