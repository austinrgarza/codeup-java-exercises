package util;

import java.util.Scanner;


public class Input {

    public static Scanner scan;

    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scan.next();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() {
        int input;
        try {
            input = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            return getInt();
        }
        return input;
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        int input;
        try {
            input = Integer.valueOf(getString());
            if (input < min || input > max); //throw new
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            return getInt(min, max);
        }
        return input;
    }

    public double getDouble() {
        System.out.println("PLease input a double number");
        double input;
        try {
            input = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number. Please try again");
            input = getDouble();
        }
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getDouble();
    }

    public boolean yesNo() {
        System.out.println("Please input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
}


