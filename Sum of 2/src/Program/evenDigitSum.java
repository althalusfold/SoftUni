package Program;

public class evenDigitSum
{
//    getEvenDigitSum(1258749);
//    getEvenDigitSum(12749);
//    getEvenDigitSum(1255559);
//    getEvenDigitSum(14488749);
//    getEvenDigitSum(1259);
//    getEvenDigitSum(224455);
    public static int getEvenDigitSum(int number2)
    {
        System.out.println("Number was: " + number2);
        int a, sum2 = 0;
        if(number2 < 0)
        {
            return -1;
        }
        while (number2 != 0)
        {
            a = number2 % 10;
            if(a % 2 == 0)
            {
                sum2 += a;
            }
            number2 /= 10;
        }
        System.out.println("Number sum is: " + sum2);
        return sum2;
    }
}
