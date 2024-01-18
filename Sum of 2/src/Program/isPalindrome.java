package Program;


public class isPalindrome
{
//    isPalindrome(121);
//    isPalindrome(1221);
//    isPalindrome(123);
//    isPalindrome(12321);
    public static boolean isPalindrome(int number)
    {
        int a = 0, b, c = number;
            while (c != 0)
            {
                a *= 10;

                b = c % 10;

                a += b;

                c /= 10;

            }
            if (number == a)
            {
                System.out.println("Palindrome! " + number);
                return true;
            }
            else
            {
                System.out.println("Not a Palindrome! " + number);
                return false;
            }
        }
    }

