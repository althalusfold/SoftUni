import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = detonateBombs(sequence, bombNumbers[0], bombNumbers[1]);

        System.out.println(sum);
    }

    public static int detonateBombs(List<Integer> sequence, int bombNumber, int bombRadius) {
        int sum = 0;

        for (int i = 0; i < sequence.size(); i++) {
            if (Objects.equals(sequence.get(i), bombNumber)) {
                int startIndex = Math.max(0, i - bombRadius);
                int endIndex = Math.min(sequence.size() - 1, i + bombRadius);

                // Remove elements within the bomb radius
                for (int j = endIndex; j >= startIndex; j--) {
                    sequence.remove(j);
                }

                // Update the loop counter to account for removed elements
                i = Math.max(0, i - bombRadius - 1);
            }
        }

        // Calculate the sum of the remaining elements
        for (int number : sequence) {
            sum += number;
        }

        return sum;
    }
}
