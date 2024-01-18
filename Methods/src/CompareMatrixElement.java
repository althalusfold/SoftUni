import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrixElement
{   //Напишете метод, който проверява дали елемент, намиращ се на дадена позиция от масив, е по-голям, или съответно по-малък от двата му съседа.
    public static String MatrixCompare(int element, int[]matrix)
    {
        String result = "Smaller than the neighbours!";
        if(matrix[element] > matrix[element-1] && matrix[element] > matrix[element+1])
        {
            result = "Bigger its neighbours";
        }
        else if(matrix[element] <= matrix[element-1] && matrix[element] >= matrix[element+1])
        {
            result="Smaller than previous element and bigger\nthan next element in the matrix";
        }
        else if (matrix[element] >= matrix[element-1] && matrix[element] <= matrix[element+1])
        {
            result="Bigger or equal to previous element\nand smaller or equal to the next element in the matrix";
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix length: ");
        int number = input.nextInt();
        int[]matrix = new int[number];
        for(int i=0; i < matrix.length; i++)
        {
            System.out.printf("Enter %d element of the matrix:",i);
            matrix[i] = input.nextInt();
        }
        System.out.println("Enter element to compare: ");
        int compareElement = input.nextInt();
        System.out.printf("Element %d in position %d is %s!",matrix[compareElement],compareElement,MatrixCompare(compareElement,matrix));
        System.out.println("\nMatrix values are: "+ Arrays.toString(matrix));
    }
}
