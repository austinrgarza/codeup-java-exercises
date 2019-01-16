import java.util.Scanner;

public class XtraPrac {

    //todo Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.

    public static boolean isEven(int a) {
        do {
            return true;

        } while (a % 2 == 0);
    }


    // TODO: Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.

    public static boolean isOdd (int a){
        do {
            return true;
        } while (a % 2 != 0);
    }

    // TODO: 1/10/19 Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".


    public static boolean vowels(String s){
        String word = s.toUpperCase();
        char[] words = word.toCharArray();
        for(int i = 0; i<words.length; i++){
            char z = words[i];
            if (z=='A'||z=='E'||z=='I'||z=='O'||z=='U') return true;
        }
        return false;
    }


    //// TODO: 1/11/19 Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.

    public static int countsEvens (int start, int end){

        int counter = 0;
        System.out.println("How many even numbers are between " + start + " and " + end + "?");

        do {
            boolean checkEven = (start % 2 == 0);
            if (checkEven){
                start++;
                counter++;
            } else {
                start +=1;
            }
        }while (start <= end);
        return counter;
    }

// // TODO: 1/11/19 counts odds

    public static int countsOdds (int start, int finish){
        int counter =0;
        System.out.println("How many even numbers are between " + start + " and " + finish + "?");

        do {
            boolean checkEven = (start % 2 != 1);
            if (checkEven){
                start++;
                counter++;
            }else {
                start+=1;
            }

        }while (start <= finish);
        return counter;
    }

    public static String  coinFlip (){
        String heads = "Heads";
        String tails = "Tails never fails";
       String headsOrTails = "";
        System.out.println("We flipped a coin and it landed on:");
        int OneOrTwo = (int) ( Math.random() * 2 + 1);
        if (OneOrTwo == 1){
            return heads +headsOrTails;
        } else {
            return tails +headsOrTails;

        }

    }

    //// TODO: 1/11/19 takes in a string of ones and zeros and returns how many of each

    public static int onesAndZerosCounter (String strOfOnesAndZeros){
        return 2;



    }



    public static void main(String[] args) {

        System.out.println(isEven(6));
        System.out.println(isOdd(5));
        System.out.println(vowels("zzzzzz"));
        System.out.println(countsEvens(1,1324));
        System.out.println(countsOdds(1, 1134));
        System.out.println(coinFlip());



    }
}
