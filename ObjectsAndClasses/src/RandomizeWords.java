import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        // Randomize the words using Fisher-Yates shuffle algorithm
        Random rnd = new Random();
        for (int i = words.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Swap words[i] and words[index]
            String temp = words[i];
            words[i] = words[index];
            words[index] = temp;
        }

        // Print the randomized words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
