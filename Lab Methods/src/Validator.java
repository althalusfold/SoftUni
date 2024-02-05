import java.util.Scanner;
public class Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean result = true;

        if (!lengthOfPassword(password)) {
            result = false;
        }
        if (!lettersAndDigits(password)) {
            result = false;
        }
        if (!digitsCheck(password)) {
            result = false;
        }

        if (result) {
            System.out.println("Password is valid");
        }
    }
    public static boolean lengthOfPassword(String password){
        int length = password.length();

        if(length < 6 || length > 10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean lettersAndDigits(String password){

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!(Character.isDigit(ch)) && !(Character.isLetter(ch))) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean digitsCheck(String password){
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                count++;
            }
        }
        if(count < 2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}
