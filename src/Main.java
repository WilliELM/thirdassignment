import java.awt.image.AreaAveragingScaleFilter;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //generate random number // assignement 1
        randomGen();
        System.out.println(randomGen());
        // check cpr nummer // assignment 2
        System.out.println( finalCpr("3205008312"));
        // make articles // assignemt 3
        Article new1 = new Article("william", "williams book");
        Article new2 = new Article("brian", "brians masterpiece");
        Article new3 = new Article("nicklas", "nicklas coding notebook");
        Article new4 = new Article("lasse", "dogs in their natural habitat");
        Article new5 = new Article("hans", "hans' journal");
        ArrayList <Article> articleList = new ArrayList<>();
        articleList.add(new1);
        articleList.add(new2);
        articleList.add(new3);
        articleList.add(new4);
        articleList.add(new5);
        System.out.println(articleList);

        //write a class "square" and compare a list of squares from their perimeter // asssignment 4
        Square newSquare1 = new Square(1,2);
        Square newSquare2 = new Square(3,2);
        Square newSquare3 = new Square(5,12);
        ArrayList <Square> squareList = new ArrayList<>();
        squareList.add(newSquare1);
        squareList.add(newSquare2);
        squareList.add(newSquare3);
        Collections.sort(squareList);
        System.out.println(squareList);

        //Write a class: RedditPost // assignment 5
        RedditPost newPost = new RedditPost(LocalDate.now(),"William",1,"Reddit Title");
        RedditPost newPost1 = new RedditPost(LocalDate.now(),"123",1,"123 Title");

        newPost.upvotePost();
        newPost.downvotePost();
        System.out.println(newPost.getScore());
        System.out.println(newPost.getAuthor());
        System.out.println(newPost.getDate());
        System.out.println(newPost.getTitle());
        newPost.setAuthor("Hermit");
        System.out.println(newPost.getAuthor());
        newPost.setTitle("The Frog");
        System.out.println(newPost.getTitle());
        ArrayList<RedditPost> redditPosts = new ArrayList<>();
        redditPosts.add(newPost);
        redditPosts.add(newPost1);

        // reddit front page // assignment 6
        RedditFrontPage newFrontPage = new RedditFrontPage(redditPosts);
        newFrontPage.deletePost(1);
        System.out.println(redditPosts);
        System.out.println(newFrontPage);

    }


    public static int randomGen (){
        //definerer den rækken tallene skal gå fra
        int min = 1;
        int max = 10;
        //bruger random metode til at generere nyt tal
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt((max-min)+1)+min;
        return randomNumber;
    }

    public static boolean finalCpr(String userinput){
        String twoFirst = userinput.substring(0,2);
        String twoSecond = userinput.substring(2,4);
        int twoFirstAsInt = Integer.parseInt(twoFirst);
        int twoSecondAsInt = Integer.parseInt(twoSecond);
        if (userinput.length() == 10){
            if (twoFirstAsInt <= 31 && twoSecondAsInt <= 12){
            return true;
        }}
        return false;


    }
    //each number if int is 10 long
    //10 is 12345678910
    public static boolean cprNummer (Long userinput){
        long first = userinput/ 1000000000 % 10;
        long second = userinput/ 100000000 % 10;
        long third = userinput/ 10000000 % 10;
        long fourth = userinput/ 1000000 % 10;
        if (userinput >= 1000000000){
            if (first <= 3 ){
                if (second<= 1){
                    if (third == 1){
                        if (fourth <= 2){
                            return true;
                        }
                        return false;
                    }
                    else if (third == 0){
                        return true;
                    }
                }
                else if (first==3 && second >1){
                    return false;
                }
            }
            else return false;
        }
        return false;
    }
}