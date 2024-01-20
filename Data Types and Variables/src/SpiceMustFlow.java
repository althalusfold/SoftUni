import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int days =0;
        while(startingYield >= 100){
            total += startingYield;
            startingYield -= 10;
            days++;
            total -= 26;
        }
        System.out.println(days);
        if(days == 0){
            System.out.println(0);
        }else{
        System.out.println(total - 26);
        }
    }
}