import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int openingCount = 0;

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openingCount++;
            } else if (input.equals(")")) {
                if (openingCount == 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
                openingCount--;
            }
        }

        if (openingCount == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
