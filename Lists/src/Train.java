import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while(!command.equals("end")){
            if(command.contains("Add")){
                int count = Integer.parseInt(command.split(" ")[1]);
                wagons.add(count);
            }else{
                int passengersToBeAdded = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int wagon = wagons.get(i);
                    if(wagon + passengersToBeAdded <= capacity){
                        wagons.set(i, wagon + passengersToBeAdded);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for(int wagon : wagons){
            System.out.print(wagon + " ");
        }
    }
}
