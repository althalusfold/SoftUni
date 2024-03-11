import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();

        while (!input.equals("end")){
            for (int i = input.length()-1; i >= 0; i--) {
                char symbol = input.charAt(i);
                reverse.append(symbol);
            }
            System.out.printf("%s = %s\n", input, reverse);
            reverse = new StringBuilder("");
            input = scanner.nextLine();
        }
    }
}
