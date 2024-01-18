import java.util.Scanner;

public class GamingScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String game = "";
        double spend = 0;
        double price = 0;

        double balance = Double.parseDouble(scanner.nextLine());
        while(balance <=0 || !game.equals("Game Time")){

            if(balance <= 0){
                System.out.println("Out of money!");
                break;
            }
            game = scanner.nextLine();
            switch (game){
                case "OutFall 4":
                    price = 39.99;
                    if(balance >= price) {
                    System.out.println("Bought OutFall 4");
                    balance -= price;
                    spend += 39.99;
                }else {
                    System.out.println("Too Expensive");
                }
                    break;

                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if(balance >= price) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        balance -= price;
                        spend += 39.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "CS: OG":
                    price = 15.99;
                    if(balance >= price) {
                    System.out.println("Bought CS: OG");
                    balance -= price;
                        spend += 15.99;
                }else {
                    System.out.println("Too Expensive");
                }
                break;

                case "Zplinter Zell":
                    price = 19.99;
                    if(balance >= price) {
                        System.out.println("Bought Zplinter Zell");
                        balance -= price;
                        spend += 19.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "Honored 2":
                    price = 59.99;
                    if(balance >= price) {
                        System.out.println("Bought Honored 2");
                        balance -= price;
                        spend += 59.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "RoverWatch":
                    price = 29.99;
                    if(balance >= price) {
                        System.out.println("Bought RoverWatch");
                        balance -= price;
                        spend += 29.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "Game Time":
                    System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spend, balance);
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
    }
}
