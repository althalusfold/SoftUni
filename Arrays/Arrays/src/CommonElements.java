package Arrays.Arrays.src;

import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");

        String[] secondArray = scanner.nextLine().split(" ");

        for (String element1 : firstArray) {
            for (String element2 : secondArray) {
                if (element1.equals(element2)) {
                    System.out.print(element1 + " ");
                    break; // Move to the next element in the first array
                }
            }
        }
    }
}
