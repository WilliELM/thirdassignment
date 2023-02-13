import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    //generate random number // assignement 1
        randomGen();
    System.out.println(randomGen());
        System.out.println(cprNumber("3105009138"));
    cprNummer(3105009138L);
        System.out.println(cprNummer(2310702152L));



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


    public static boolean cprNumber (String userInput) {
        if (userInput.length() == 10){
            System.out.println(userInput.charAt(0));
             if (userInput.charAt(0) <= 3 && userInput.charAt(1) <= 1) {

                 if (userInput.charAt(2) >= 1 && userInput.charAt(3) >= 2){
                     return true;
                }
            }
        }

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
// hvis første tal er 3 eller under gå videre           // hvis tredje tal er 1 eller under gå videre
    // hvis næste tal er 1 return false                 // hvis fjerde tal er under 2 gå videre

}