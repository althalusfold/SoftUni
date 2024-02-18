import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cityCounts = Integer.parseInt(scanner.nextLine());
        List<String> city = new ArrayList<>();
        List<Double> income = new ArrayList<>();
        List<Double> expenses = new ArrayList<>();
        double profit = 0;
        double totalProfit = 0;

        for (int i = 1; i <= cityCounts; i++) {
            city.add(scanner.nextLine());
            income.add(Double.parseDouble(scanner.nextLine()));
            expenses.add(Double.parseDouble(scanner.nextLine()));
            if(i % 3 == 0){
                expenses.set(i-1,expenses.get(i-1)*1.5);
            }
            if((i % 5) ==0){
                income.set(i-1, income.get(i-1)*0.9);
            }
            profit = income.get(i-1) - expenses.get(i-1);
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city.get(i-1), profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);
    }
}