package Arrays.Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input sequence of space-separated strings
        String inputLine = scanner.nextLine();

        // Split the input line into an array of strings
        String[] strings = inputLine.split(" ");

        // Reverse the array of strings
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = temp;
        }

        // Print the reversed array of strings
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
