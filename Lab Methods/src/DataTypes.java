import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String input = scanner.nextLine();
        printResult(type, input);

    }
    public static void printResult(String type, String input){
        switch (type){
            case "int":
                int number = Integer.parseInt(input);
                System.out.print(number * 2);
                break;

            case "real":
                double realNumber = Double.parseDouble(input);
                System.out.printf("%.2f", realNumber * 1.5);
                break;

            case "string":
                StringBuilder str = new StringBuilder();
                str.append("$");
                str.append(input);
                str.append("$");
                System.out.print(str);
                break;
        }
    }
}
