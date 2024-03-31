import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(?:@+|#+)([a-z]{3,})(?:@+|#+)[^a-zA-Z0-9]+(\\d+)/";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String color = matcher.group(1);
            int amount = Integer.parseInt(matcher.group(2));
            System.out.printf("You found %d %s eggs!%n", amount, color);
        }
    }
}
