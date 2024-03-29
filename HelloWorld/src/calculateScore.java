public class calculateScore
{ //OVERLOADING Methods
    public  static void main(String[] args)
    {
        int newScore = calculateScore("Pesho", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(43);
        calculateScore();

        calcFeetAndInchesToCentimeters(8,4);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(8, 7);
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(-18, 13);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
        {
            if (feet >= 0 && inches >= 0 && inches <= 12)
            {
                double centimeters = (feet * (12 * 2.54)) + inches * 2.54;
                System.out.println(feet + " feet and " + inches + " inches are: " + centimeters + " centimeters!");
                return centimeters;
            }
            else
            {
                System.out.println("Wrong parameters! ");
                return -1;
            }
        }

    public static double calcFeetAndInchesToCentimeters(double inches)
        {
            if(inches >= 0)
            {
                double feet = (int)inches / 12;
                double remainingInches = (int)inches % 12;
                System.out.println(inches + " inches are: " + feet + " feet and " + remainingInches + " inches!");
                return calcFeetAndInchesToCentimeters(feet, remainingInches);
            }
            else
            {
                System.out.println("Wrong parameters! ");
                return -1;
            }
        }



    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 10;
    }

    //OVERLoading Methods
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("Player " + " scored " + " points");
        return 0;
    }



}
