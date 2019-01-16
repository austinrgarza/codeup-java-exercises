package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        int count = 0;
        do {
            count++;
            System.out.println("What is the radius?");
            Circle circle = new Circle(input.getDouble());
            System.out.println("Area is " + circle.getArea());
            System.out.println("Circumference is " + circle.getCircumfrence());

            System.out.println("Do you wish to continue?");
            input.getString();
        }while(input.yesNo());
        System.out.println("You Created " + count + " Circles!");


    }
}