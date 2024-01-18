import java.util.Scanner;

public class LastNumberEnglish
{   //Напишете метод, който връща английското наименование на последната цифра от дадено число. Примери: за числото 512 отпечатва "two"; за числото 1024 – "four".
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        EnglishName(input.nextInt());
    }
    public static void EnglishName(int number)
    {
        number = number % 10;
        System.out.println("Last number is: ");
        switch (number)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }
    }
}
