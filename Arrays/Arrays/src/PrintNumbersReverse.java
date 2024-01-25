package Arrays.Arrays.src;

import java.util.Scanner;

public class PrintNumbersReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[count];

        for(int i = 0; i <= numbers.length -1 ; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = numbers.length -1 ; j >=0; j--){
            System.out.print(numbers[j] + " ");
        }
    }
}
