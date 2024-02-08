import java.util.Scanner;

public class ClosestPointToCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        closestPointToCenter(x1, y1, x2, y2);
    }

    public static void closestPointToCenter(int x1, int y1, int x2, int y2) {
        // Calculate the distance of each point from the center (0, 0)
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

        // Check which point is closer to the center
        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)%n", x1, y1);
        } else {
            System.out.printf("(%d, %d)%n", x2, y2);
        }
    }
}
