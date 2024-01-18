import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();
        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;

        for(int i= 1; i<= lostGames; i++){
            if(i % 2 == 0){
                countHeadset++;
            }
            if(i % 3 == 0){
                countMouse++;
            }
            if(i % 6 == 0){
                countKeyboard++;
            }

            }
        for(int j =1; j <= countKeyboard; j++) {
            if (j % 2 == 0){
                countDisplay++;
            }
        }
        double totalCost = countHeadset * headsetPrice + countMouse * mousePrice + countKeyboard * keyboardPrice + countDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}


//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.
//You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment.