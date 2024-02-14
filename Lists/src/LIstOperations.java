import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class LIstOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.contains("End")){
            String operation = String.valueOf(command.split(" ")[0]);
            int index = 0;
            int turns = 0;
            int numberValue = 0;

            switch (operation){
                case "Add":
                    numberValue = (Integer.parseInt(command.split(" ")[1]));
                    numbers.add(numberValue);
                    break;

                case "Remove":
                    index = (Integer.parseInt(command.split(" ")[1]));
                    if(index < numbers.size()) {
                        numbers.remove(index);
                    }else{
                        System.out.println("Invalid Index");
                        break;
                    }
                    break;

                case "Shift":
                    turns = (Integer.parseInt(command.split(" ")[2]));
                    if(((command.split(" ")[1])).equals("left")){
                        for (int i = 0; i < turns; i++) {
                            numbers.add(numbers.getFirst());
                            numbers.removeFirst();
                        }
                    }else{
                        for (int i = 0; i < turns; i++) {
                            numbers.addFirst(numbers.getLast());
                            numbers.removeLast();
                        }
                    }
                    break;

                case "Insert":
                    index = (Integer.parseInt(command.split(" ")[2]));
                    numberValue = (Integer.parseInt(command.split(" ")[1]));
                    if(index <= numbers.size()) {
                        numbers.add(index, numberValue);
                    }else{
                        System.out.println("Invalid Index");
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
