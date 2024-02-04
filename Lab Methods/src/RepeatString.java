import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldString = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(oldString, repeat));
    }

    private static String repeatString(String str, int count){
        StringBuilder endResult = new StringBuilder();
        for (int i = 0; i < count; i++) {
            endResult.append(str);
        }
        return endResult.toString();
    }
}
