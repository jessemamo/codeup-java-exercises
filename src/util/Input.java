package util;

import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Input() {
        this.scanner = new Scanner(System.in);

    }
    public boolean yesNo() {
        String userDecision;
        boolean userYesOrNo;
        System.out.println("Enter a boolean decision. Y or N");
        userDecision = scanner.nextLine();
        if (userDecision.equalsIgnoreCase("y")) {
            userYesOrNo = true;
        } else {
            userYesOrNo = false;
        }
        return userYesOrNo;
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInt = scanner.nextInt();
        if (userInt < min || userInt > max) {
            return getInt(min, max);
        } else return userInt;
    }
    public int getInt() {
        System.out.println("Enter an integer");
        int userInt = scanner.nextInt();
        return userInt;
    }
    public double getDouble(double min, double max) {
        System.out.println("Enter a double between " + min + " and " + max);
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            return getDouble(min, max);
        } else return userDouble;
    }
    public double getDouble() {
        System.out.println("Please enter a double");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
