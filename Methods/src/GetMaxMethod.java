import java.util.Scanner;

public class GetMaxMethod
{   //Създайте метод getMax() с два целочислени (int) параметъра, който връща по-голямото от двете числа. Напишете програма, която прочита три цели числа от конзолата и отпечатва най-голямото от тях, изпол-звайки метода getMax().
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        GetMax(input.nextInt(),input.nextInt());
    }
    public static int GetMax(int a, int b)
    {
        int maxNumber=0;

        if(a>b)
        {
            maxNumber = a;
            System.out.println("Max number is:" + maxNumber);

        }
        else if (b>a)
        {
            maxNumber = b;
            System.out.println("Max number is:" + maxNumber);
        }
        else
        {
            System.out.println("A = B");
            maxNumber = a;
        }
        return maxNumber;
    }
}
