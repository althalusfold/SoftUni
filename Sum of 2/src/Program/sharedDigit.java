package Program;

public class sharedDigit
{
//        hasSharedDigit(14,22);
//        hasSharedDigit(15,12);
//        hasSharedDigit(55,15);
//        hasSharedDigit(85,5);
//        hasSharedDigit(12,222);

    public static boolean hasSharedDigit(int a, int b)
    {
        int firstNumber, secondNumber;
        System.out.println("Numbers were: " + a + " and "+ b);
        if(a < 10 || a > 99 || b < 10 || b > 99)
        {
            System.out.println("One of the numbers is bigger than 99 or smaller than 10. Numbers are: a=" + a +" b="+ b);
            return false;
        }
        while(a != 0)
        {
            firstNumber = a % 10;
            int c = b;
            while(c != 0)
            {
                secondNumber = c % 10;
                if(secondNumber == firstNumber)
                {

                    System.out.println("Do they have similar numbers? : Ture");

                    return true;
                }
                c /= 10;
            }
            a /= 10;
        }
        System.out.println("Do they have similar numbers? : False");
        return false;
    }
}
