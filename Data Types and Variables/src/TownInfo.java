import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population = scanner.nextInt();
        float area = scanner.nextFloat();

        System.out.printf("Town %s has population of %d and area %.0f square km.", townName, population, area);
    }
}
