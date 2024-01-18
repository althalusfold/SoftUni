import java.util.Scanner;

public class RecursiveNestedLoops
{   //Напишете програма, която генерира всички вариации с повторение на n елемента от k-ти клас.
    //(1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)
    public static int numberOfLoops;
    public static int numberOfIterations;
    public static int[] loops;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        numberOfIterations = input.nextInt();
        System.out.print("K = ");
        numberOfLoops = input.nextInt();
        input.close();
        loops = new int[numberOfLoops];
        nestedLoops(0);
    }
    public static void nestedLoops(int currentLoop)
    {
        if (currentLoop == numberOfLoops)
        {
            printLoops();
            return;
        }
        for (int counter=1;counter<=numberOfIterations;counter++)
        {
            loops[currentLoop] = counter;
            nestedLoops(currentLoop + 1);
        }
    }
    public static void printLoops()
    {
        for (int i = 0; i < numberOfLoops; i++)
        {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}