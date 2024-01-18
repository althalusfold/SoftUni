import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String normalString = scanner.nextLine();
        for(int i = normalString.length() - 1; i >= 0; i--){
            System.out.print(normalString.charAt(i));
        }
    }
}
