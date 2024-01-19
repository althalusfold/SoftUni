import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int peopleCapacity = scanner.nextInt();
        int rides = people / peopleCapacity;
        if(Math.ceil(people % peopleCapacity) > 0){
            rides += 1;
        }
        System.out.println(rides);
    }
}
