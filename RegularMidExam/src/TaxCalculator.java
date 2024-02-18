
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input string representing vehicles
        String input = scanner.nextLine();

        // Split the input string by ">>" to get individual vehicle details
        String[] vehicles = input.split(">>");

        // Initialize variables to keep track of total tax collected
        double tax = 0;
        double totalTax = 0;
        int kilometersTax;
        double revenueTax = 0;

        // Process each vehicle
        for (String vehicle : vehicles) {
            // Split the vehicle details into type, years, and kilometers
            String[] details = vehicle.split("\\s+");
            String type = details[0];
            int years = Integer.parseInt(details[1]);
            int kilometers = Integer.parseInt(details[2]);

            switch (details[0]) {
                case "family":
                    tax = 50;
                    kilometers = Integer.parseInt(details[2]);
                    kilometersTax = kilometers / 3000;
                    totalTax = tax - (5 * Double.parseDouble(details[1])) + kilometersTax * 12;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", details[0], totalTax);
                    revenueTax += totalTax;
                    break;

                case "heavyDuty":
                    tax = 80;
                    kilometers = Integer.parseInt(details[2]);
                    kilometersTax = kilometers / 9000;
                    totalTax = tax - (8 * Double.parseDouble(details[1])) + kilometersTax * 14;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", details[0], totalTax);
                    revenueTax += totalTax;
                    break;

                case "sports":
                    tax = 100;
                    kilometers = Integer.parseInt(details[2]);
                    kilometersTax = kilometers / 2000;
                    totalTax = tax - (9 * Double.parseDouble(details[1])) + kilometersTax * 18;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", details[0], totalTax);
                    revenueTax += totalTax;
                    break;

                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", revenueTax);
    }
}
