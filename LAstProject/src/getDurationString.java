public class getDurationString
{
    public static void main(String[] args)
    {
        System.out.println(getDuration(65,25));
    }
        public static String getDuration ( int minutes, int seconds)
        {
            if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
                int hour = minutes / 60;
                int remainingMinutes = minutes % 60;
                return hour + "h " + remainingMinutes + "m " + seconds + "s ";
            } else {
                return "Invalid value";
            }

        }
        public static int getDuration ( int seconds)
        {
            if (seconds >= 0) {
                int minutes = seconds / 60;
                int remainingSeconds = seconds % 60;
                return minutes + remainingSeconds;
            } else {
                System.out.println("Invalid value");
            }
            return 0;
        }

}
