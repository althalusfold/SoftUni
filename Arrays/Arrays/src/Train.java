package Arrays.Arrays.src;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int  wagons = Integer.parseInt(scanner.nextLine());
        int sum= 0;
        int[] peoplePerWagon = new int[wagons];

        for (int i= 0; i< wagons; i++) {
            peoplePerWagon[i] = Integer.parseInt(scanner.nextLine());
            sum+=peoplePerWagon[i];
        }
        for(int people : peoplePerWagon){
            System.out.print(people + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
