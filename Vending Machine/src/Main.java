import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            }

            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                total += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
        }

        while (true) {
            String product = scanner.nextLine();

            if (product.equals("End")) {
                System.out.printf("Change: %.2f%n", total);
                break;
            }

            double price = 0;

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    continue;
            }

            if (total >= price) {
                total -= price;
                System.out.printf("Purchased %s%n", product);
            } else {
                System.out.println("Sorry, not enough money");
            }
        }

        scanner.close();
    }
}
