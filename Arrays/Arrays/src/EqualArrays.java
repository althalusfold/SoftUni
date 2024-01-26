package Arrays.Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(firstArray.length,secondArray.length);
        int sum= 0;
        boolean result = true;

        for(int i=0; i< maxLength; i++){
            if(firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                result = false;
                break;
            }else {
                sum += firstArray[i];
            }
        }
        if(result){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

