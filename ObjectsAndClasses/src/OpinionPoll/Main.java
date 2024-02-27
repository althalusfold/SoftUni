package OpinionPoll;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Person [] person = new Person[count];

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            String age = input.split(" ")[1];
            Person person1 = new Person(name, Integer.parseInt(age));
            if(person1.getAge() > 30){
                System.out.println(person1.getName() + " - " + person1.getAge());
            }
        }
    }
}
