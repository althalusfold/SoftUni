package Articles;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title,content,author);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            input = scanner.nextLine();
            String command = input.split(": ")[0];
            String text = input.split(": ")[1];

            switch (command) {
                case "Edit":
                    article.Edit(text);
                    break;

                case "ChangeAuthor":
                    article.ChangeAuthor(text);
                    break;

                case "Rename":
                    article.Rename(text);
                    break;
            }
        }
            System.out.println(article);
    }
}
