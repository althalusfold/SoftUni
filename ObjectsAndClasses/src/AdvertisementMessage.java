import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        List<String> phrase = List.of("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can't live without this product.");
        List<String> event = List.of("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy with the result.",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> author = List.of("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> city = List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

        Scanner scanner = new Scanner(System.in);
        int numberOfAdds = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();

        for (int i = 0; i < numberOfAdds; i++) {
            int phraseIndex = rnd.nextInt(phrase.size());
            int eventIndex = rnd.nextInt(event.size());
            int authorIndex = rnd.nextInt(author.size());
            int cityIndex = rnd.nextInt(city.size());

            System.out.println(phrase.get(phraseIndex) + " " + event.get(eventIndex) + " " +
                    author.get(authorIndex) + " - " + city.get(cityIndex));
        }
    }
}
