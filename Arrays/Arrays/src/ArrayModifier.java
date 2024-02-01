package Arrays.Arrays.src;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        String[] commands = new String[3];
        String end = "end";
        int currentValue = 0;
        boolean work = true;
        while (work) {
            commands = scanner.nextLine().split(" ");
            switch (commands[0]){
                case "swap":
                    currentValue = array[Integer.parseInt(commands[1])];
                    array[Integer.parseInt(commands[1])] = array[Integer.parseInt(commands[2])];
                    array[Integer.parseInt(commands[2])] = currentValue;
                    break;

                case "multiply":
                    currentValue = array[Integer.parseInt(commands[1])] * array[Integer.parseInt(commands[2])];
                    array[Integer.parseInt(commands[1])] = currentValue;
                    break;

                case "decrease":
                    for (int i = 0; i < array.length; i++){
                        array[i]-=1;
                    }
                    break;

                case "end":
                    work = false;
                    break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
