import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        char symbol =' ';
        String message = "";

        for(int i=0; i<lines; i++){
            symbol = scanner.nextLine().charAt(0);
            int symbolNumber = symbol;
            char c = (char) (key + symbolNumber);
            message += c;
        }
        System.out.println(message);
    }
}
