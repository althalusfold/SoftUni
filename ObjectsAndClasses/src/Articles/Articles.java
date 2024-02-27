package Articles;
public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void Edit(String content){
        this.content = content;
    }

    public void ChangeAuthor(String author){
        this.author = author;
    }

    public void Rename(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
