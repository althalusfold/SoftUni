import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Enter the number of centuries
        int centuries = scanner.nextInt();

        // Calculate years, days, hours, and minutes
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        // Output: Display the result
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes%n",
                centuries, years, days, hours, minutes);
    }
}
