import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SignCheck(Double.parseDouble(scanner.nextLine()));
    }

    public static void SignCheck(double grade){
        if(grade <= 2.99 && grade >= 2.0){
            System.out.print("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.print("Poor");
        }else if(grade >= 3.5 && grade <= 4.49){
            System.out.print("Good");
        }else if(grade >= 4.5 && grade <= 5.49){
            System.out.print("Very good");
        }else if(grade >= 5.5 && grade <= 6.00){
            System.out.print("Excellent");
        }
    }
}
