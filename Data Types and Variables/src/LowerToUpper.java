import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if(Character.isUpperCase(symbol)){
            symbol = Character.toLowerCase(symbol);
        }else{
            symbol = Character.toUpperCase(symbol);
        }
        System.out.println(symbol);
    }
}
