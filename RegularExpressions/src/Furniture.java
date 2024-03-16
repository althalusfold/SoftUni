import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furniture = new ArrayList<>();
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                furniture.add(matcher.group("furnitureName"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalPrice += price * quantity;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for(String furnitures : furniture){
            System.out.println(furnitures);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}


//Bought furniture:
//Sofa
//TV
//Total money spend: 2436.69