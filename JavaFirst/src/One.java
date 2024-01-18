import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFood = Integer.parseInt(scanner.nextLine());
        totalFood *= 1000;
        int food = 0;
        while(scanner.hasNextInt()) {
            int foodPerDay = Integer.parseInt(scanner.nextLine());
            food += foodPerDay;
        }
        String adopted = scanner.nextLine();
        if(adopted.equals("Adopted")){
            if(totalFood >= food) {
                System.out.printf("Food is enough! Leftovers: %d grams.", (totalFood - food));
            }else{
                System.out.printf("Food is not enough. You need %d grams more.", (food - totalFood));
            }
        }
    }
}