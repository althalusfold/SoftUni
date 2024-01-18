import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int f = 0;

        if (a <= b && a >= c) {
            f = a;
            a = b;
            b = f;
        }else if(a <= b && b <= c){
            f = a;
            a = c;
            c = f;

        }else if(a >= b && a <= c){
            f = b;
            b = a;
            a = c;
            c = f;
        }else if(a <= b && b >= c){
            f = c;
            c = a;
            a = b;
            b = f;
        }
        System.out.println(a +"\n" + b + "\n"+ c);
    }
}
