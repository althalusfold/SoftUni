import java.util.Scanner;
public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String action = scanner.nextLine();
        String command = action.split(" ")[0];
        StringBuilder text = new StringBuilder(input);

        while (!action.equals("Finish")) {
            switch (command) {
                case "Replace":
                    String textForReplace = action.split(" ")[1];
                    String replacementText = action.split(" ")[2];
                    text = new StringBuilder(text.toString().replaceAll(textForReplace, replacementText));
                    System.out.println(text);
                    break;

                case "Cut":
                    int startIndex = Integer.parseInt(action.split(" ")[1]);
                    int endIndex = Integer.parseInt(action.split(" ")[2]);

                    if (isValidIndex(startIndex, text) && isValidIndex(endIndex, text)) {
                        text.delete(startIndex, endIndex + 1);
                        System.out.println(text);
                    }
                    break;

                case "Make":
                    if (action.contains("Upper")) {
                        for (int i = 0; i < text.length(); i++) {
                            char c = text.charAt(i);
                            if (Character.isLowerCase(c)) {
                                text.setCharAt(i, Character.toUpperCase(c));
                            }
                        }
                    } else {
                        for (int i = 0; i < text.length(); i++) {
                            char c = text.charAt(i);
                            if (Character.isUpperCase(c)) {
                                text.setCharAt(i, Character.toLowerCase(c));
                            }
                        }
                    }
                    System.out.println(text);
                    break;

                case "Check":
                    String message = action.split(" ")[1];
                    if (text.toString().contains(message)) {
                        System.out.printf("Message contains %s%n", message);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", message);
                    }
                    break;

                case "Sum":
                    int firstIndex = Integer.parseInt(action.split(" ")[1]);
                    int lastIndex = Integer.parseInt(action.split(" ")[2]) + 1;

                    if (isValidIndex(firstIndex, text) && isValidIndex(lastIndex, text)) {
                        String substring = text.substring(firstIndex, lastIndex);
                        int sum = 0;
                        for (int i = 0; i < substring.length(); i++) {
                            char a = substring.charAt(i);
                            sum += a;
                        }
                        System.out.println(sum);
                    }
                    break;
            }

            action = scanner.nextLine();
            command = action.split(" ")[0];
        }
    }
    public static boolean isValidIndex(int index, StringBuilder builder) {
        if (index >= 0 && index <= builder.length() - 1) {
            return true;
        } else {
            System.out.println("Invalid indices!");
            return false;
        }
    }
}
