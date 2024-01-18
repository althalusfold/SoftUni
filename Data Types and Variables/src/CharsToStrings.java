import java.util.Scanner;

public class CharsToStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        for(short i = 0; i < 3; i++ ) {
            char symbol = scanner.next().charAt(0);
            result.append(symbol);
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = result.length()-1; i >= 0; i--) {
            reversed.append(result.charAt(i));
            reversed.append(" ");
        }
        System.out.println(reversed);
    }
}
