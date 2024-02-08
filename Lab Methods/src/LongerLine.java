import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        printLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static void printLongerLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);

        if (length1 >= length2) {
            printLine(x1, y1, x2, y2);
        } else {
            printLine(x3, y3, x4, y4);
        }
    }

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        // Calculate the distance between two points using the Euclidean distance formula
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printLine(int x1, int y1, int x2, int y2) {
        // Calculate the distance of each endpoint to the center (0, 0)
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

        // Print the line starting with the point closer to the center
        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)(%d, %d)%n", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)%n", x2, y2, x1, y1);
        }
    }
}
