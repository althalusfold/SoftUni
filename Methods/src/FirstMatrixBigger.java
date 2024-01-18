import java.util.Arrays;
import java.util.Scanner;

public class FirstMatrixBigger
{
    //Напишете метод, който връща позицията на първия елемент на масив, който е по-голям от двата свои съседи едновременно, или -1, ако няма такъв елемент.
    public static int MatrixCompare(int[] matrix)
    {
        int result = 0;
        for (int i = 1; i < matrix.length-1; i++)
        {
            if (((matrix[i] > matrix[i-1])) && (matrix[i] > matrix[i+1]))
            {
                result = i;
                break;
            }
            else
            {
                result = -1;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix length: ");
        int[] matrix = new int[input.nextInt()];

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.printf("Enter position %d element of the matrix:", i);
            matrix[i] = input.nextInt();
        }
        if (MatrixCompare(matrix) != -1)
        {
            System.out.printf("Element in position %d is bigger than its neighbours!", MatrixCompare(matrix));
        }
        else
        {
            System.out.println("No such element!");
        }
        System.out.println("\nMatrix values are: " + Arrays.toString(matrix));
    }
}
