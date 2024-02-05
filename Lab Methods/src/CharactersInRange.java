import java.util.Scanner;
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        printCharInRange(firstChar, secondChar);
    }
    public static void printCharInRange(char a, char b){
        if (a > b) {
            char temp = a;
            a = b;
            b = temp;
        }

        int first = (int) a;
        int second = (int) b;
        for (int i = first +1 ; i < second; i++) {
            System.out.print((char) i + " ");
        }
    }
}
