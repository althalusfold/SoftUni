import java.util.Scanner;

public class EnglishName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastNumber = number % 10;
        String numberInWords = "";
        switch (lastNumber){
            case 1:
                numberInWords = "one";
                break;
            case 2:
                numberInWords = "two";
                break;
            case 3:
                numberInWords = "three";
                break;
            case 4:
                numberInWords = "four";
                break;
            case 5:
                numberInWords = "five";
                break;
            case 6:
                numberInWords = "six";
                break;
            case 7:
                numberInWords = "seven";
                break;
            case 8:
                numberInWords = "eight";
                break;
            case 9:
                numberInWords = "nine";
                break;
            case 0:
                numberInWords = "zero";
                break;
        }
        System.out.println(numberInWords);
    }
}
