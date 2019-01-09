import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int i = 5;

        while(i < 15){
            i++;
//            System.out.println(i);
        }

        int n = 0;
        do{
            n = n+2;
//            System.out.println(n);
        }
        while (n < 100);
        int x = 100;
        do{
            x= x - 5;
//            System.out.println(x);
        }
        while(x > 0);

        long num = 2;

        do{
            System.out.println(num);
            num = num * num;
        }
        while(num < 1000000);

        for (int h = 100; h >= 100; h=h-5){
            System.out.println(h);
        }

        for (long z = 2; z < 1000000; z=z*z){
            System.out.println(z);
        }
        //fizzbuzz

        for (int j = 1; j <= 100; j++) {
            boolean fizzOrBuzz = false;
            if (j % 3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (j % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(j));
            }
        }

//        System.out.println("enter an integer");
//        int numberEntered = Integer.parseInt(scanner.next());
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//        for(int p = 0; p <= numberEntered; p += 1) {
//            int sq = p *p;
//            int cube = p*p*p;
//            System.out.println(p+"      | " + sq + "       | " + cube);
//
//        }
        String userChoice = "yes";
        System.out.println("Enter a numerical grade.");
        int gradeEntered = Integer.parseInt(scanner.next());
        if (gradeEntered >=88){
            System.out.println(gradeEntered +" is an A");
        } else if (gradeEntered < 88 && gradeEntered > 80){
            System.out.println(gradeEntered + " is a B");

        } else if (gradeEntered < 80 && gradeEntered > 67){
            System.out.println(gradeEntered + " is a C");

        }else if (gradeEntered < 67 && gradeEntered > 60){
            System.out.println(gradeEntered + " is a D");

        }else if (gradeEntered < 60 && gradeEntered > 0){
            System.out.println(gradeEntered + " is an F");

        }
        System.out.println("Would you like to enter another?");


        }
}
