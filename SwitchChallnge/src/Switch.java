
public class Switch
{
    public static void main(String[] args)
    {
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-5);
        printDayOfTheWeek(10);
        printDayOfTheWeek(0);

    }
    public  static void printDayOfTheWeek (int day)
    {
        switch (day) {
            case 1:
                System.out.println("The day is Monday!");
                break;
            case 2:
                System.out.println("The day is Tuesday!");
                break;
            case 3:
                System.out.println("The day is Wednesday!");
                break;
            case 4:
                System.out.println("The day is Thursday!");
                break;
            case 5:
                System.out.println("The day is Friday!");
                break;
            case 6:
                System.out.println("The day is Saturday!");
                break;
            case 7:
                System.out.println("The day is Sunday!");
                break;
            default:
                System.out.println("No such option. Pick from 1 to 7!");
        }
    }
}
