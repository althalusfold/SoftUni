package Program;

public class SUMOF
    {

//        sumFirstAndLastDigit(5);
//        sumFirstAndLastDigit(10);
//        sumFirstAndLastDigit(15);
//        sumFirstAndLastDigit(30);
//        sumFirstAndLastDigit(24);
//        sumFirstAndLastDigit(18);
//        sumFirstAndLastDigit(252);
        public static int sumFirstAndLastDigit(int number)
        {
            System.out.println("Number was: " + number);
            if(number < 0)
            {
                return -1;
            }
            int a, sum, b = 0;
            a = number % 10;
            while(number >= 10)
            {
                number /= 10;
            }
            sum = number + a;

            System.out.println("Sum of digits is: " + sum);
            return sum;
        }


    }

