import java.util.Scanner;

public class NameMethod
{   //Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!" (например "Hello, Peter!"). Напишете програма, която тества този метод.
        public static void main(String[] args)
        {
            System.out.println("Enter your mane: ");
            Scanner input = new Scanner(System.in);
            Hello (input.nextLine());
        }
        public static String Hello(String name)
        {
            System.out.printf("Hello %s!", name);
            return name;
        }
}
