package Arrays.Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine()
                .split(" "))
                    .mapToInt(Integer::parseInt)
                        .toArray();

        int [] temp = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            temp[i] = firstArray[i];
        }

        if(firstArray.length == 1){
            System.out.printf("%d", firstArray[0]);
        }else{
            for(int i=0; i< firstArray.length - 1; i++){
                int[] currentArray = new int[temp.length- 1];
                for (int j = 0; j <currentArray.length; j++) {
                    currentArray[j] = temp[j] +temp[j+1];
                }
                temp = currentArray;
            }
            System.out.print(temp[0]);
        }
    }
}
