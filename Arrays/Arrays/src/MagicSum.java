package Arrays.Arrays.src;
import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
