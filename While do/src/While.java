

public class While
{
    public static void main(String[] args)
    {

        int number2 = 4;
        int firstNumber = 20;
        int evenNumberCount = 0;

        for(int number = 4; number <=20; number++)
        {
            isEvenNumber(number);
        }
        while (number2 <= firstNumber)
        {
            number2++;
            if (!isEvenNumber2(number2))
            {
                continue;
            }

            evenNumberCount++;

            System.out.println("Number: "+ number2 + " is even.");
            if (evenNumberCount == 5)
            {
                System.out.println("Even number count is: " + evenNumberCount);
                break;
            }
        }
    }
    public static int isEvenNumber(int number)
    {
        while(number%2 == 0)
        {
            System.out.println("Number: " + number + " is even.");

            break;
        }
            while (number%2 != 0)
            {
                System.out.println("Number: " + number + " is odd.");

                break;
            }
        return number;
    }
    public static boolean isEvenNumber2(int number2)
    {
        if ((number2 % 2) ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
