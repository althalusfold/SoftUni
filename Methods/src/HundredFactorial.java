import java.math.BigInteger;

public class HundredFactorial
{
    public static void main(String[] args)
    {   //Напишете програма, която пресмята и отпечатва n! за всяко n в интервала [1..100].
        for(int i=1; i<=16; i++)
        {
            System.out.println("Factorial of number: "+i+ " is: "+CalculateFactorial(i));
        }
    }
    public static long CalculateFactorial(int number)
    {
        String s="";
        if (number==1)
        {
            return 1;
        }
        else
        {
            return (number * CalculateFactorial(number - 1));
        }
    }
}
