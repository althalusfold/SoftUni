import java.util.Scanner;
public class PrintTriangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            printTriangle(Integer.parseInt(scanner.nextLine()));
        }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
