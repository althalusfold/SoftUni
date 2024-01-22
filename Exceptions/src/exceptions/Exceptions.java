import java.util.Scanner;

public class Exceptions {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        char[] charArray = {'f', 'm', 'M', 'F'};

        while (true) {
            System.out.println("Input array index: ");
            int index = keyboard.nextInt();
            keyboard.nextLine();

            try {
                if (index >= 0 && index < charArray.length) {
                    System.out.println("The value at the provided index is: " + charArray[index]);
                } else {
                    System.out.println("Index out of bounds!");
                }
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println("An unexpected error occurred!");
            }
        }
    }
}
