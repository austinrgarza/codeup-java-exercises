import java.util.Scanner;
public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Talk to bob.");
        String messageToBob = scanner.next();

        boolean end = true;
    do {

    messageToBob= scanner.next();

    end = (!messageToBob.equals("bye"));

    if (messageToBob.endsWith("?")){
        System.out.println("Sure.");
    } else if (messageToBob.endsWith("!")){
        System.out.println("Woah dude bro don't yell.");
    } else if (messageToBob.equals("")){
        System.out.println("I didn't want to talk to you anyways.");
    } else {
        System.out.println("Whatever");
    }

    } while (end);




    }
}
