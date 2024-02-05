import java.util.Scanner;
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.print(printMiddleCharacters(text));

    }
    public static StringBuilder printMiddleCharacters(String text){
        StringBuilder middle = new StringBuilder();
        if(text.length() % 2 == 0){
            int secondSymbol = text.length() / 2;
            int firstSymbol = secondSymbol - 1;
            char a = text.charAt(firstSymbol);
            char b = text.charAt(secondSymbol);
            middle.append(a);
            middle.append(b);
        }else{
            int symbol = text.length() / 2;
            char a = text.charAt(symbol);
            middle.append(a);
        }
        return middle;
    }
}


// bridge - 6 length
// middle - 3
// first symbol - middle - 1
// second symbol - 3


//jackets - 7 length
//middle - length / 2