import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int v = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 != 0){
                v++;
                sum += i;
                System.out.println(i);
                if(v == n){
                    break;
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
