import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int bombNumberIndex = 0;
        int bombRadius = bombNumbers[1];
        int start = 0;
        int end = 0;

        if(!(bombRadius >= sequence.size()-1) && !(sequence.size() <= bombRadius * 2)) {

            for (int i = 0; i < sequence.size(); i++) {

                if (Objects.equals(sequence.get(i), bombNumbers[0])) {
                    bombNumberIndex = i;

                    if (bombNumberIndex >= bombRadius) {
                        start = bombNumberIndex - bombRadius;
                        end = bombNumberIndex + bombRadius;
                        for (int j = start; j <= end; j++) {
                            if (start == sequence.size()) {
                                break;
                            }
                            sequence.remove(start);
                        }
                    } else {
                        for (int j = 0; j <= bombRadius; j++) {
                            sequence.remove(0);
                        }
                    }
                }
            }
        }else{
            sequence.clear();
        }
        for(int number : sequence){
           sum += number;
        }
        System.out.println(sum);
    }
}

