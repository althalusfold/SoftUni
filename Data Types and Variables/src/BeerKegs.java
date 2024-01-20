import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());
        String winner = "";
        double maxVolume = 0;

        for (int i = 0; i < kegs; i++) {
            String kegType = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                winner = kegType;
            }
        }
        System.out.println(winner);
    }
}