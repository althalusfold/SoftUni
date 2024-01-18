import java.util.Scanner;

public class StringSubVariations
{   //Напишете програма, която отпечатва всички подмножества на дадено множество от думи.
    //Enter array length: 3
    //
    //Enter 1 word: fun
    //Enter 2 word: sun
    //Enter 3 word: gun
    //
    //(fun), (sun), (gun),
    //(fun sun), (fun gun), (sun gun),
    //(fun sun gun),
    static String[] wordsArr;
    static void FindSubsets(int[] arr, int index, int start, int end)
    {
        if (index >= arr.length)
        {
            System.out.print("(");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.printf("%s", wordsArr[arr[i]]);
                if (i != arr.length - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.print("), ");
        }
        else
            for (int i = start; i < end; i++)
            {
                arr[index] = i;
                FindSubsets(arr, index + 1, i + 1, end);
            }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = input.nextInt();
        input.nextLine();
        wordsArr = new String[length];
        System.out.println();
        for (int i = 0; i < wordsArr.length; i++)
        {
            System.out.printf("Enter %s word: ", i + 1);
            wordsArr[i] = input.nextLine();
        }
        int k = 0;
        while(k<=length)
        {
            k++;
            int[] arr = new int[k];
            System.out.println();
            FindSubsets(arr, 0, 0, length);
        }
    }
}
