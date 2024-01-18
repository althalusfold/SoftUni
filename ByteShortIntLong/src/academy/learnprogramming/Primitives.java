package academy.learnprogramming;


public class Primitives
{
    public static void main(String[] args)
    {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value is: " + myMinIntValue);
        System.out.println("Integer max value is: " + myMaxIntValue);
        System.out.println();

        System.out.println("Max busted value +1 is: " + (myMaxIntValue + 1)); //overflow
        System.out.println("Min busted value +1 is: " + (myMinIntValue - 1)); //underflow
        System.out.println();

        byte myMinBiteValue = Byte.MIN_VALUE;
        byte myMaxBiteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value is: " + myMinBiteValue);
        System.out.println("Integer max value is: " + myMaxBiteValue);
        System.out.println();

        System.out.println("Max busted value +1 is: " + (myMinBiteValue + 1)); //overflow
        System.out.println("Min busted value +1 is: " + (myMaxBiteValue - 1)); //underflow
        System.out.println();

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value is: " + myMinShortValue);
        System.out.println("Short max value is: " + myMaxShortValue);
        System.out.println();

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value is: " + myMinLongValue);
        System.out.println("Long max value is: " + myMaxLongValue);
        System.out.println();

        long bigLongLiteralValue = 2_124_483_647_234L;
        System.out.println("BigLong value is: " + bigLongLiteralValue);
        System.out.println();

        byte challengeByte = 32;
        short challengeShort = 15868;
        int challengeInt = 100;
        long challengeLong = 50000L + 10L * ((long) challengeByte + (long) challengeShort + (long) challengeInt);
        short challengeShortTotal = (short) (2 * (challengeByte + challengeShort + challengeInt));
        // Could be done without casting (long)!!
        // Must be done for "short"!!!

        System.out.println("Challenge result is: " + challengeLong);
        System.out.println();

        System.out.println("Challenge short result is: " + challengeShortTotal);
        System.out.println();

        float myFloatValue = 10.51f;
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value is: " + myMinFloatValue);
        System.out.println("Float max value is: " + myMaxFloatValue);
        System.out.println();

        System.out.println("Float value *2 is: " + (2 * myFloatValue));
        System.out.println();

        double myDoubleValue = 10.51;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value is: " + myMinDoubleValue);
        System.out.println("Double max value is: " + myMaxDoubleValue);
        System.out.println();

        System.out.println("Double value *2 is: " + (2 * myDoubleValue));
        System.out.println();

        int myIntNumber = 5;
        float myFloatNumber = 5.25f;
        double myDoubleNumber = 5.25;

        int myIntNumber2 = 5 / 3;
        float myFloatNumber2 = 5f / 3f;
        double myDoubleNumber2 = 5d / 3d;
        System.out.println("Int value is: " + myIntNumber2);
        System.out.println("Float value is: " + myFloatNumber2);
        System.out.println("Double value is: " + myDoubleNumber2);
        System.out.println();

        int pounds = 200;
        double kilograms = (double) pounds * 0.45359237;
        System.out.println("Kilograms value is: " + kilograms);
        System.out.println();

        char myChar = '\u0044'; //unicode for " D " \ u - unicode and code 0044
        System.out.println("My Char is: " + myChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOver21 = true;

        // Strings
        String myString = "This is a string";
        System.out.println("My String is :" + myString);
        myString = myString + " Гъци гъци\u00A9";
        System.out.println("My String is :" + myString);
        myString = myString + pounds;
        System.out.println("My String is :" + myString);
        System.out.println();

        int result = 1 + 2; //1 + 2 = 3
        // this is a comment
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result= " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result= " + previousResult);
        result = result * 10; //2*10=20
        System.out.println("2 * 10 = " + result);
        System.out.println();

        result = result % 3;
        System.out.println("Remainder of result % 3 is: " + result);
        System.out.println();

        result++;
        System.out.println("Result value + 1 is: " + result);
        System.out.println();

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("No aliens allowed!");
        }
        System.out.println();

        int toScore = 100;
        if (toScore == 100) {
            System.out.println("Top score is 100!");
        }
        if (toScore >= 100) {
            System.out.println("Top score is bigger or equal to: 100!");
        }
        System.out.println();

        double challenge2 = 20.00;
        double challenge21 = 80.00;
        double multiply = 100.00 * (challenge2 + challenge21);
        double remainder = multiply % 40.00;
        boolean variable = remainder == 0 ? true : false;
        System.out.println("Boolean variable result is: " + variable);
        if (!variable) {
            System.out.println("Got some remainder!");
        }
        System.out.println();

        //statements
        int myVariable = 50;
        myVariable++;
        myVariable--;


        //Methods

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Final score: " + finalScore);

        finalScore = calculateScore(gameOver, 10000, 8, 200);
        System.out.println("Final score: " + finalScore);

        int position = calculatedHighScore(1500);
        displayHighScorePosition("Tom", position);

        position = calculatedHighScore(900);
        displayHighScorePosition("Dan", position);

        position = calculatedHighScore(400);
        displayHighScorePosition("Jim", position);

        position = calculatedHighScore(50);
        displayHighScorePosition("Nick", position);



    }
// END of MAIN !!!
    //
    //
    //
    //
    //
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String name, int position)
    {
        System.out.println(name + " is at position: " + position);
        System.out.println();
    }

    public static int calculatedHighScore(int challengeScore)
    {
        if (challengeScore >= 1000)
        {
            return 1;
        }
        else if (challengeScore >= 500)
        {
            return 2;
        }
        else if (challengeScore >= 100)
        {
            return 3;
        }
            return 4;
    }
}





