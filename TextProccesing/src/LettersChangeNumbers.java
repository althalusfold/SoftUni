import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> sequence = List.of(input.split("\\s+"));
        List<Double> results = new ArrayList<>();
        StringBuilder currentString;
        double result = 0;
        double totalResult = 0;

        for (int i = 0; i < sequence.size(); i++) {
            currentString = new StringBuilder(sequence.get(i));
            char firstLetter = currentString.charAt(0);
            char lastLetter = currentString.charAt(currentString.length() - 1);
            int currentNumber = Integer.parseInt(currentString.substring(1, currentString.length()-1));
            int firstLetterPosition = 0;
            int lastLetterPosition = 0;

            if (!Character.isLowerCase(firstLetter)) {
                firstLetterPosition = firstLetter - 64;
                result = currentNumber * 1.0 / firstLetterPosition;
            } else {
                firstLetterPosition = firstLetter - 96;
                result = currentNumber * firstLetterPosition;
            }

            if (!Character.isLowerCase(lastLetter)) {
                lastLetterPosition = lastLetter - 64;
                result = result - lastLetterPosition;
            } else {
                lastLetterPosition = lastLetter - 96;
                result = result + lastLetterPosition;
            }
            results.add(result);
        }

        for(Double total : results){
//          System.out.println(total);
            totalResult += total;
        }
        System.out.printf("%.2f\n",totalResult);
    }
}
