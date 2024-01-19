import java.util.Scanner;

public class ThreeLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                for(int k = 0; k < number; k++){
                    char firstChar = (char) ('a' +i);
                    char secondChar = (char)('a'+ j);
                    char thirdChar = (char)('a'+ k);
                    System.out.printf("%c%c%c%n",firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
