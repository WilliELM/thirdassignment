import java.util.ArrayList;

public class RedditFrontPage {
    private static ArrayList<RedditPost> list;


public RedditFrontPage(ArrayList<RedditPost> list){
    RedditFrontPage.list = list;



}
    public void deletePost (int indexOfPostToDelete){
        list.remove(indexOfPostToDelete);
    }

    @Override
    public String toString() {
        return "RedditFrontPage{" +
                "list=" + list +
                '}';
    }
}
