import java.util.Scanner;
public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valuePerDay = 0;
        int days = 0;
        double dayAmount = 0;
        double average = 0;

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            valuePerDay = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= days; j++) {
                dayAmount = Double.parseDouble(scanner.nextLine());
                average += dayAmount;
            }
            average /= days;

            if (average >= valuePerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            }
            if (valuePerDay > average) {
                System.out.printf("You need %.2f gold.%n", (valuePerDay - average));
            }
            average = 0;
        }
    }
}
