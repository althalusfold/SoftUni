import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallNumber = scanner.nextInt();
        int bigNumber = scanner.nextInt();
        char a = ' ';
        for(int i = smallNumber; i <= bigNumber; i++){
            a = (char)(i);
            System.out.print(a + " ");
        }
    }
}
