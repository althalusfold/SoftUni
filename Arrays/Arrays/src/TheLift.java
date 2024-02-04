package Arrays.Arrays.src;
import java.util.Arrays;
import java.util.Scanner;
public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());

        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int space = 0;
        int result = people / 4;
        if(people < 4){
            result = 1;
        }

        int capacity = array.length * 4;
        for (int j : array) {
            space += j;
        }
        capacity -= space;

        if(people == capacity){
            Arrays.fill(array, 4);
            for(int full : array)
                System.out.print(full +" ");
        }else {
            if (people < capacity) {
                System.out.println("The lift has empty spots!");

                for (int i = 0; i < result; i++) {
                    if (array[i] >= 0 && array[i] < 4 && people > 0) {
                        if(people < 4){
                            array[i]=people;
                            people = 0;
                        }else {
                            int difference = 4 - array[i];
                            array[i] += difference;
                            people -= difference;
                            array[array.length - 1] = people;
                        }
                    }
                }
                for (int seats : array) {
                    System.out.print(seats + " ");
                }
            } else {
                Arrays.fill(array, 4);
                System.out.printf("There isn't enough space! %d people in a queue!%n", people - capacity);
                for (int fullSeats : array) {
                    System.out.print(fullSeats + " ");
                }
            }
        }
    }
}
