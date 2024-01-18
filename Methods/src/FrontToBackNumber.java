import java.util.Scanner;

public class FrontToBackNumber
{
    public static void main(String[] args)
    {   //Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред. Например 256, трябва да бъде отпечатано като 652.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        int number = input.nextInt();
        System.out.printf("Reversed number is: %d",(ReverseNumber(number)));
    }
    public static int ReverseNumber(int number)
    {
        int reversed = 0;
            if (number >= 1)
            {
                if((number>=100) && (number<1000))
                {
                    int temp = number % 10;
                    number /= 10;
                    reversed += temp*100;
                }
                if((number<=99)&&(number>=10))
                {
                    int temp = number % 10;
                    temp *=10;
                    number /= 10;
                    reversed += temp;
                }
                if(number<10)
                {
                    int temp = number % 10;
                    reversed += temp;
                }
            }
        return reversed;
    }
}
