import java.util.Scanner;

public class LoginReversedPassword {
    public static void main(String[] args) {
        String reversed;
        String password;
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        for (int i = 0; i<4; i++){
            password = scanner.nextLine();
            reversed = new StringBuilder(userName).reverse().toString();
            if (!password.equals(reversed) && (i == 3)){
                System.out.printf("User %s blocked!", userName);
            }else if (!password.equals(reversed)){
                System.out.println("Incorrect password. Try again.");
            }else{
                System.out.printf("User %s logged in.",userName);
                i=3;
            }
        }
        scanner.close();
    }
}
