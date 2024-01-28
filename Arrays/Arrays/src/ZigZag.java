package Arrays.Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrCount = Integer.parseInt(scanner.nextLine());
        int[] oddPosition = new int[arrCount];
        int[] evenPosition = new int[arrCount];

        for (int i = 0; i < arrCount; i++) {
            int[] number = Arrays.stream(scanner.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            if(i % 2 == 0){
                oddPosition[i] = number[0];
                evenPosition[i] = number[1];
            }else{
                oddPosition[i] = number[1];
                evenPosition[i] = number[0];
            }
        }
        for(int position : oddPosition) {
            System.out.print(position + " ");
        }
        System.out.println();
        for(int position : evenPosition) {
            System.out.print(position + " ");
        }
    }
}
