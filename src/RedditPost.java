import java.time.LocalDate;

public class RedditPost {
    private LocalDate date;
    private String author;
    private String title;
    private int score;

    private int downvotes;


    public RedditPost(LocalDate date, String author, int score, String title){
        this.date = date;
        this.score = score;
        this.author = author;
        this. title = title;

    }

    public LocalDate getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void upvotePost() {
        score++;
    }

    public void downvotePost() {
        this.downvotes++;
    }

    public int getScore() {
        return score - downvotes;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setTitle (String title){
        this.title = title;
    }


}
