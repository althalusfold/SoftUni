import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine()
                .split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] commands = input.split(" \\| ");

            switch (commands[0]) {
                case "Add Book":
                    String bookName = commands[1];
                    if (!books.contains(bookName)) {
                        books.add(0, bookName);
                        break;
                    }
                    break;

                case "Take Book":
                    bookName = commands[1];
                    if (books.contains(bookName)) {
                        books.remove(bookName);
                        break;
                    }
                    break;

                case "Swap Books":
                    String firstBookName = commands[1];
                    String secondBookName = commands[2];
                    if (books.contains(firstBookName) && books.contains(secondBookName)) {
                        int firstBookIndex = books.indexOf(firstBookName);
                        int secondBookIndex = books.indexOf(secondBookName);
                        books.set(firstBookIndex, secondBookName);
                        books.set(secondBookIndex, firstBookName);
                        break;
                    }
                    break;

                case "Insert Book":
                    bookName = commands[1];
                    if (!books.contains(bookName)){
                        books.add(bookName);
                        break;
                    }
                    break;

                case "Check Book":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < books.size()) {
                        System.out.println(books.get(index));
                        break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        // Print the collection of books joined by ", "
        String booksAsString = String.join(", ", books);
        System.out.println(booksAsString);
    }
}
