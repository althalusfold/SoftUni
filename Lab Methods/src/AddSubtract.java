import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        calculate(firstNumber, secondNumber, thirdNumber);
    }
    public static int calculate(int a, int b){
        return a + b;
    }

    public static void calculate(int a, int b, int c){
        System.out.println(calculate(a,b) - c);
    }
}

/////////////////////////////////////////////////////////////////////////

//     adding(firstNumber, secondNumber, thirdNumber);
//    }
//
//    public static void adding(int a, int b, int c){
//        subtract(a + b, c);
//    }
//
//    public static void subtract(int sum, int c){
//        System.out.println(sum - c);
//    }
//}

///////////////////////////////////////////////////////////////////////////

//subtract(firstNumber, secondNumber, thirdNumber);
//    }
//
//    public static int adding(int a, int b){
//        return a + b;
//    }
//
//    public static void subtract(int a, int b, int c){
//        System.out.println(adding(a,b) - c);
//    }
//}