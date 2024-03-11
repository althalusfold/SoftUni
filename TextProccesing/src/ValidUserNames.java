import java.util.List;
import java.util.Scanner;
public class ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> userNames = List.of(input.split(", "));
        for (int i = 0; i < userNames.size() ; i++) {
            String current = userNames.get(i);
            if(isUserNameValid(current)){
                System.out.println(current);
            }
        }
    }
    private static  boolean isUserNameValid(String current){
        if(current.length() < 3 || current.length() > 16){
            return false;
        }
        for (char symbol : current.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) &&  symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
