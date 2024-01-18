import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int after30 = minutes + 30;

        if (after30 >= 60){
            hour+=1;
            after30 -= 60;
        }
        if (hour > 23){
            hour = 0;
        }
        if(after30 < 10){
            System.out.printf("%d:0%d", hour, after30);
        }else {
            System.out.printf("%d:%d", hour, after30);
        }
    }
}
