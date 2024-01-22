package Orders.src;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int daysInMonth = 0;
        int capsulesCount = 0;
        double total = 0;

        for (int i=1; i<=n; i++){
           double pricePerCapsule = scanner.nextDouble();
            daysInMonth = scanner.nextInt();
            capsulesCount = scanner.nextInt();
            double dayTotal = pricePerCapsule * daysInMonth * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f\n", dayTotal);
            total += dayTotal;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
