import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counts = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < counts; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            String user = parts[1];

            switch (command){
                case "register":
                    String licencePlate = input.split(" ")[2];
                    if(!users.containsKey(user)){
                        users.put(user, licencePlate);
                        System.out.printf("%s registered %s successfully%n", user, licencePlate);
                    }else{
                        System.out.printf("ERROR: already registered with plate number %s%n", licencePlate);
                    }
                    break;

                case "unregister":
                    if(users.containsKey(user)){
                        users.remove(user);
                        System.out.printf("%s unregistered successfully%n", user);
                    }else{
                        System.out.printf("ERROR: user %s not found%n", user);
                    }
                    break;
            }
        }
        users.forEach((user, plateNumber) -> System.out.printf("%s => %s%n", user, plateNumber));
    }
}
