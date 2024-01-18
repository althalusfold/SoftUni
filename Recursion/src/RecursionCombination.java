
import java.util.Scanner;

public class RecursionCombination
{   //Напишете програма, която генерира и отпечатва всички комбинации с повторение на k елемента над n-елементно множество.
    public static void main(String[] args)
    {
        System.out.print("Enter N= ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Enter K= ");
        int k = input.nextInt();
        int[] matrix = new int[k];
        PrintCombination(matrix, 0, 1, n);

    }
    public static void PrintCombination(int[] matrix, int index, int start, int end)
    {
            if (index >= matrix.length)
            {
                for (int i = 0; i < matrix.length; i++)
                {
                    if (i < matrix.length - 1)
                    {
                        System.out.print("(");
                        System.out.printf("%d ", matrix[i]);
                    }
                    else
                    {
                        System.out.print(matrix[i]);
                        System.out.print("), ");
                    }
                }
            }
            else
                for (int i = start; i <= end; i++)
                {
                    matrix[index] = i;
                    PrintCombination(matrix, index + 1, i, end);
                }
        }
}
