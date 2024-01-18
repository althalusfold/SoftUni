import java.util.Scanner;
public class Job6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        boolean end = false;
        for(int a = 1; a < 9; a++) {
            for (int b = 9; b > a; b--) {
                for (int c = 1; c < 9; c++) {
                    for (int d = 9; d > c; d--) {
                        int sum = a + b + c + d;
                        int product = a * b * c * d;
                        if (sum == product && n % 5 == 0) {
                            number = a * 1000 + b * 100 + c * 10 + d;
                            System.out.println(number);
                            end = true;

                        } else if ((product / sum) == 3 && n % 3 == 0) {
                            number = d * 1000 + c * 100 + b * 10 + a;
                            System.out.println(number);
                            end = true;
                        }
                        if (end && number > 0){
                            break;
                        }
                    }
                    if (end && number > 0) {
                        break;
                    }
                }
                if (end && number > 0) {
                    break;
                }
            }
            if (end && number > 0) {
                break;
            }
        }
        if (!end) {
            System.out.println("Nothing found");
        }
    }
}
