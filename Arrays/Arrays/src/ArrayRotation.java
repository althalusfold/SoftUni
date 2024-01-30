package Arrays.Arrays.src;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        //"51 47 32 61 21".split(" ") -> ["51", "47", "32", "61", "21"]
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countRotations; i++) {
            //ротация на масива
            //1. взимам първия елемент
            String firstElement = array[0]; //"51"

            //2. преместваме елементите наляво
            //["51", "47", "32", "61", "21"] -> ["47", "32", "61", "21", "21"]
            for (int j = 0; j < array.length - 1 ; j++) {
                array[j] = array[j + 1];
            }
            //3. поставям първия елемент на последно място
            //["47", "32", "61", "21", "51"]
            array[array.length - 1] = firstElement;
        }
        //приключваме с ротациите -> принтираме всички елементи на масива
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
//51 47 32 61 21
//32 61 21 51 47