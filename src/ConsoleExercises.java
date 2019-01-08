import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n",pi);

        Scanner scanner = new Scanner(System.in).useDelimiter("\n"); // and change the next lines to next after adding the useDelimiter

        System.out.print("Enter an integer: ");
//        String userInput = scanner.next();
        float val = Float.parseFloat(scanner.next());

        System.out.format("You entered: --> %.0f <--\n", val);

        System.out.println("Enter 3 names:");


        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.println("first = " + firstWord);
        System.out.println("second = " + secondWord);
        System.out.println("first = " + thirdWord);

        System.out.println("Enter a sentence:");

        String yourSentence = scanner.next();

        System.out.format( yourSentence + " :now this is a beautifully crafted sentence!");

        System.out.println("Let us calculate this room's perimeter and area.");
        System.out.println("What is the length?");

        double length = Double.parseDouble(scanner.next());

        System.out.println("whats the width?");

        double width = Double.parseDouble(scanner.next());

        double area = length * width;

        double perimeter = (length * 2) + (width * 2);

        System.out.println("The area is :"+ area);
        System.out.println("The perimeter is :"+ perimeter);

    }
}
