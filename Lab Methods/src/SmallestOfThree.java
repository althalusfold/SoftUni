import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(smallestNumber(a,b,c));
    }

    public static int smallestNumber(int a, int b, int c){
        int lowest = a;
        if (b < lowest) {
            lowest = b;
        }
        if (c < lowest) {
            lowest = c;
        }
        return lowest;
    }
}
