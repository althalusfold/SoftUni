import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberMessage = 0;
        int f = 0;
        String message ="";
        while(f < number) {
            numberMessage = scanner.nextInt();
            f++;
            switch (numberMessage) {
                case 2:
                    message += "a";
                    break;
                case 3:
                    message += "d";
                    break;
                case 4:
                    message += "g";
                    break;
                case 5:
                    message += "j";
                    break;
                case 6:
                    message+= "m";
                    break;
                case 7:
                    message += "p";
                    break;
                case 8:
                    message += "t";
                    break;
                case 9:
                    message += "w";
                    break;
                case 0:
                    message += " ";
                    break;
                case 22:
                    message += "b";
                    break;
                case 33:
                    message += "e";
                    break;
                case 44:
                    message += "h";
                    break;
                case 55:
                    message += "k";
                    break;
                case 66:
                    message += "n";
                    break;
                case 77:
                    message += "q";
                    break;
                case 88:
                    message += "u";
                    break;
                case 99:
                    message += "x";
                    break;
                case 222:
                    message += "c";
                    break;
                case 333:
                    message += "f";
                    break;
                case 444:
                    message += "i";
                    break;
                case 555:
                    message += "l";
                    break;
                case 666:
                    message += "o";
                    break;
                case 777:
                    message += "r";
                    break;
                case 888:
                    message += "v";
                    break;
                case 999:
                    message += "y";
                    break;
                case 7777:
                    message += "s";
                    break;
                case 9999:
                    message += "z";
                    break;
                }
        }
        System.out.print(message);
    }
}
