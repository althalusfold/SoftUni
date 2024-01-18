public class main
{
    public static void main(String[] args)
    {
        System.out.println(getDuration(65,25));
        System.out.println(getDuration(87));
    }
    public static String getDuration ( int minutes, int seconds)
    {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59)
        {
            int hour = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hour + "h " + remainingMinutes + "m " + seconds + "s ";
        }
        else
        {
            return "Invalid value";
        }

    }
    public static String getDuration ( int seconds)
    {
        if (seconds >= 0)
        {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDuration(minutes,remainingSeconds);
        }
        else
        {
            return "Invalid value";
        }
    }

}