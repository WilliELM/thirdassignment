import java.util.ArrayList;

public class RedditFrontPage {
    ArrayList postRedditList = new ArrayList<>();

public RedditFrontPage(ArrayList postRedditList){
    this.postRedditList = postRedditList;


}
    public void deletePost (int indexOfPostToDelete){
        postRedditList.remove(indexOfPostToDelete);
    }
}
