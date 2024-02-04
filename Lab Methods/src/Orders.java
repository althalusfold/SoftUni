import java.util.Scanner;

public class Orders {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String product = scanner.nextLine();
            int quantity = Integer.parseInt(scanner.nextLine());
            TotalPrice(product, quantity);
        }

        public static void TotalPrice(String product, int quantity){
            double price = 0;
            switch (product){
                case "coffee":
                    price = 1.5;
                    break;

                case "water":
                    price = 1.00;
                    break;

                case "coke":
                    price = 1.4;
                    break;

                case "snacks":
                    price = 2.00;
                    break;
            }
            System.out.printf("%.2f", price * quantity);
        }
}


