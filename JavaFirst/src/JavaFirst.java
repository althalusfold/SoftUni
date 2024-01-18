import java.util.Scanner;
class JavaFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bySea = Integer.parseInt(scanner.nextLine());
        int byMountain = Integer.parseInt(scanner.nextLine());
        int total = 0;
        while(bySea > 0 || byMountain > 0) {
            String input = scanner.nextLine();
            if(!input.equals("Stop")) {
                switch (input) {
                    case "sea":
                        if(bySea > 0) {
                            bySea--;
                            total += 680;
                        }
                        break;

                    case "mountain":
                        if(byMountain > 0) {
                            byMountain--;
                            total += 499;
                        }
                        break;
                }
            }
            else{
                System.out.printf("Profit: %d leva.", total);
            }
        }
        if(bySea == 0 && byMountain == 0) {
            System.out.printf("%nGood job! Everything is sold.%nProfit: %d leva.", total);
        }
    }
}


