import java.util.Scanner;
public class HighLow {
    public static String guessingGame(){


        double rand = Math.floor(Math.random() * 100) + 1;
        int num = (int) rand;
        int numOfGuesses = 10;
        String result = "";

        System.out.printf("You have %d guesses!%n",numOfGuesses);
        for(int guesses = 1; guesses <= numOfGuesses; guesses++) {
            System.out.println("Guess a number between 1 and 100");
            Scanner scanner = new Scanner(System.in);

            int userNum = scanner.nextInt();

            if(userNum < num){
                System.out.println("HIGHER");
                System.out.printf("You have %d guesses%n",(numOfGuesses-guesses));
            } else if (userNum > num) {
                System.out.println("LOWER");
                System.out.printf("You have %d guesses%n",(numOfGuesses-guesses));
            } else {
                result = "You got it champ!";
                System.out.println(result);
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args){
        guessingGame();





    }
}
