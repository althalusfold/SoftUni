package Arrays.Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int maxNumber = 0;
        for (int i = array.length-1; i > 0; i--) {
            if(array[i-1] > array[i] && array[i-1] > maxNumber){
                maxNumber = array[i-1];
                System.out.print(maxNumber +" ");
            }
        }
    }
}


// 1 5 2 9 3 17 2

// 17 2 